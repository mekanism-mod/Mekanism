/**
 * Copyright (c) 2011-2014, SpaceToad and the BuildCraft Team
 * http://www.mod-buildcraft.com
 *
 * BuildCraft is distributed under the terms of the Minecraft Mod Public
 * License 1.0, or MMPL. Please check the contents of the license located in
 * http://www.mod-buildcraft.com/MMPL-1.0.txt
 */
package buildcraft.api.gates;

import net.minecraft.client.renderer.texture.TextureAtlasSpriteRegister;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;

public interface IGateExpansion {

	String getUniqueIdentifier();

	String getDisplayName();

	GateExpansionController makeController(TileEntity pipeTile);

	void registerBlockOverlay(TextureAtlasSpriteRegister iconRegister);

	void registerItemOverlay(TextureAtlasSpriteRegister iconRegister);

	TextureAtlasSprite getOverlayBlock();

	TextureAtlasSprite getOverlayItem();
}
