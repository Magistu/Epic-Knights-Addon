package com.magistuarmory.addon.client.render.model.armor;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class MaximilianBurgonetModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(38, 6).addBox(-4.0F, -7.9F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.97F))
		.texOffs(32, 0).addBox(-4.0F, -7.9F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rmask = mask.addOrReplaceChild("rmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rmask_r1 = rmask.addOrReplaceChild("rmask_r1", CubeListBuilder.create().texOffs(0, 3).addBox(-0.0142F, -2.0446F, -0.0632F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0954F, -28.0927F, -7.8096F, -0.5084F, -0.4648F, 0.0F));

		PartDefinition rmask_r2 = rmask.addOrReplaceChild("rmask_r2", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-6.5376F, -0.5126F, -0.5198F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.041F, -27.9372F, -7.0179F, 0.4648F, 0.4648F, 0.0F));

		PartDefinition rmask_r3 = rmask.addOrReplaceChild("rmask_r3", CubeListBuilder.create().texOffs(0, 10).mirror().addBox(-6.9858F, -3.6479F, -0.1453F, 7.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.1955F, -29.0927F, -8.2096F, -1.0756F, 0.4648F, 0.0F));

		PartDefinition rmask_r4 = rmask.addOrReplaceChild("rmask_r4", CubeListBuilder.create().texOffs(0, 3).mirror().addBox(-6.9858F, -2.0446F, -0.0632F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0954F, -28.0927F, -7.8096F, -0.5084F, 0.4648F, 0.0F));

		PartDefinition lmask = mask.addOrReplaceChild("lmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lmask_r1 = lmask.addOrReplaceChild("lmask_r1", CubeListBuilder.create().texOffs(0, 5).addBox(-0.4624F, -0.5126F, -0.5198F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.041F, -27.9372F, -7.0179F, 0.4648F, -0.4648F, 0.0F));

		PartDefinition lmask_r2 = lmask.addOrReplaceChild("lmask_r2", CubeListBuilder.create().texOffs(0, 10).addBox(-0.0142F, -3.6479F, -0.1453F, 7.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1955F, -29.0927F, -8.2096F, -1.0756F, -0.4648F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}