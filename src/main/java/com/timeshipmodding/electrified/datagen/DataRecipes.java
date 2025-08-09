package com.timeshipmodding.electrified.datagen;

import com.timeshipmodding.electrified.Electrified;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import static com.timeshipmodding.electrified.content.item.registries.ModItems.*;
import static com.timeshipmodding.electrified.content.block.registries.ModBlocks.*;

public class DataRecipes extends RecipeProvider implements IConditionBuilder {
    public DataRecipes(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(packOutput, pRegistries);
    }

    private static final List<ItemLike> BAUXITE_SMELTABLES = List.of(RAW_ALUMINIUM.get(), BAUXITE_ORE.get(), DEEPSLATE_BAUXITE_ORE.get());
    private static final List<ItemLike> NICKEL_SMELTABLES = List.of(RAW_NICKEL.get(), NICKEL_ORE.get(), DEEPSLATE_NICKEL_ORE.get());

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {
        // Shaped Recipes
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ALUMINIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', ALUMINIUM_INGOT.get())
                .unlockedBy("has_aluminium_ingot", has(ALUMINIUM_INGOT.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RAW_ALUMINIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', RAW_ALUMINIUM.get())
                .unlockedBy("has_raw_aluminium", has(RAW_ALUMINIUM.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ALUMINIUM_FRAME.get())
                .pattern("A A")
                .pattern("   ")
                .pattern("A A")
                .define('A', ALUMINIUM_INGOT.get())
                .unlockedBy("has_aluminium_ingot", has(ALUMINIUM_INGOT.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, COPPER_FRAME.get())
                .pattern("A A")
                .pattern("   ")
                .pattern("A A")
                .define('A', Items.COPPER_INGOT)
                .unlockedBy("has_copper_ingot", has(Items.COPPER_INGOT)).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, NICKEL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', NICKEL_INGOT.get())
                .unlockedBy("has_nickel_ingot", has(NICKEL_INGOT.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, RAW_NICKEL_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', RAW_NICKEL.get())
                .unlockedBy("has_raw_nickel", has(RAW_NICKEL.get())).save(recipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, MAGNET.get())
                .pattern("   ")
                .pattern("AB ")
                .pattern("CD ")
                .define('A', NICKEL_INGOT.get())
                .define('B', Items.BLUE_DYE)
                .define('C', ALUMINIUM_INGOT.get())
                .define('D', Items.RED_DYE)
                .unlockedBy("has_nickel_ingot", has(NICKEL_INGOT.get())).save(recipeOutput);

        // Shapeless Recipes
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ALUMINIUM_INGOT.get(), 9).requires(ALUMINIUM_BLOCK.get()).unlockedBy("has_aluminium_block", has(ALUMINIUM_BLOCK.get())).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_ALUMINIUM.get(), 9).requires(RAW_ALUMINIUM_BLOCK.get()).unlockedBy("has_raw_aluminium_block", has(RAW_ALUMINIUM_BLOCK.get())).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, NICKEL_INGOT.get(), 9).requires(NICKEL_BLOCK.get()).unlockedBy("has_nickel_block", has(NICKEL_BLOCK.get())).save(recipeOutput);
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, RAW_NICKEL.get(), 9).requires(RAW_NICKEL_BLOCK.get()).unlockedBy("has_raw_nickel_block", has(RAW_NICKEL_BLOCK.get())).save(recipeOutput);

        // Ore Smelting
        oreSmelting(recipeOutput, BAUXITE_SMELTABLES, RecipeCategory.MISC, ALUMINIUM_INGOT.get(), 0.7F, 200, "aluminium_ingot");
        oreSmelting(recipeOutput, NICKEL_SMELTABLES, RecipeCategory.MISC, NICKEL_INGOT.get(), 0.7F, 200, "nickel_ingot");

        // Ore Blasting
        oreBlasting(recipeOutput, BAUXITE_SMELTABLES, RecipeCategory.MISC, ALUMINIUM_INGOT.get(), 0.7F, 100, "aluminium_ingot");
        oreBlasting(recipeOutput, NICKEL_SMELTABLES, RecipeCategory.MISC, NICKEL_INGOT.get(), 0.7F, 100, "nickel_ingot");
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