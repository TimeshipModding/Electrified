package com.timeshipmodding.electrified.datagen;

import com.timeshipmodding.electrified.Electrified;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.electrified.content.item.registries.ModItems.*;
import static com.timeshipmodding.electrified.content.blocks.registries.ModBlocks.*;

public class DataRecipes extends RecipeProvider implements IConditionBuilder {
    public DataRecipes(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(packOutput, pRegistries);
    }

    private static final List<ItemLike> BAUXITE_SMELTABLES = List.of(RAW_ALUMINIUM.get(), BAUXITE_ORE.get(), DEEPSLATE_BAUXITE_ORE.get());

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        // Shaped Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ALUMINIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ALUMINIUM_INGOT.get())
                .unlockedBy("has_aluminium_ingot", has(ALUMINIUM_INGOT.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, STEEL_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', STEEL_INGOT.get())
                .unlockedBy("has_steel_ingot", has(STEEL_INGOT.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RAW_ALUMINIUM_BLOCK.get())
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', RAW_ALUMINIUM.get())
                .unlockedBy("has_raw_aluminium", has(RAW_ALUMINIUM.get())).save(recipeOutput);

        // Shapeless Recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ALUMINIUM_INGOT.get(), 9).requires(ALUMINIUM_BLOCK.get()).unlockedBy("has_aluminium_block", has(ALUMINIUM_BLOCK.get())).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, STEEL_INGOT.get(), 9).requires(STEEL_BLOCK.get()).unlockedBy("has_steel_block", has(STEEL_BLOCK.get())).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_ALUMINIUM.get(), 9).requires(RAW_ALUMINIUM_BLOCK.get()).unlockedBy("has_raw_aluminium_block", has(RAW_ALUMINIUM_BLOCK.get())).save(recipeOutput);

        // Ore Smelting
        oreSmelting(recipeOutput, BAUXITE_SMELTABLES, RecipeCategory.MISC, ALUMINIUM_INGOT.get(), 0.7F, 200, "aluminium_ingot");

        // Ore Blasting
        oreBlasting(recipeOutput, BAUXITE_SMELTABLES, RecipeCategory.MISC, ALUMINIUM_INGOT.get(), 0.7F, 100, "aluminium_ingot");
    }

    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pRecipeOutput, Electrified.MODID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}
