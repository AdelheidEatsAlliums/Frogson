package net.adelheideatsalliums.frogson;

import net.adelheideatsalliums.frogson.Block.TonslanBlocks;
import net.adelheideatsalliums.frogson.Crops.CropBlocks;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.client.render.RenderLayer;

public class FrogsonClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), TonslanBlocks.POSTEN_FLOWERS);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.TOMATO_BUSH);
        BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(), CropBlocks.FLOWERING_TOMATO_BUSH);

    }
}