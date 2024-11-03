package com.magistuarmory.addon.client.render.model.shield;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.magistuarmory.client.render.model.item.MedievalShieldModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class DuelingShieldModel {// extends MedievalShieldModel {

//	public DuelingShieldModel(net.minecraft.class_630 root) {
//		super(root);
//	}

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition plate = partdefinition.addOrReplaceChild("plate", CubeListBuilder.create().texOffs(44, 19).addBox(-5.0F, -24.5F, -7.0F, 8.0F, 24.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 31).addBox(-9.0F, -28.5F, -5.0F, 16.0F, 32.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-7.0F, -26.8F, -4.5F, 12.0F, 29.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(52, 0).addBox(-4.0F, -43.5F, -4.5F, 6.0F, 18.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(52, 46).mirror().addBox(-12.0F, -38.5F, -4.5F, 6.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false)
				.texOffs(52, 46).addBox(4.0F, -38.5F, -4.5F, 6.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(1.0F, 8.5F, 3.0F));

		PartDefinition shield_r1 = plate.addOrReplaceChild("shield_r1", CubeListBuilder.create().texOffs(52, 0).addBox(-3.0F, -9.0F, 0.0F, 6.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, 9.5F, -4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition shield_r2 = plate.addOrReplaceChild("shield_r2", CubeListBuilder.create().texOffs(52, 46).addBox(-3.0F, -9.0F, 0.0F, 6.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.0F, 4.5F, -4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition shield_r3 = plate.addOrReplaceChild("shield_r3", CubeListBuilder.create().texOffs(52, 46).mirror().addBox(-3.0F, -9.0F, 0.0F, 6.0F, 18.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(7.0F, 4.5F, -4.5F, 0.0F, 0.0F, -3.1416F));

		PartDefinition handle = partdefinition.addOrReplaceChild("handle", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -41.0F, 2.0F, 2.0F, 26.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(1.0F, 24.0F, -3.7F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}
}