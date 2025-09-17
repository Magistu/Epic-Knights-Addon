package com.magistuarmory.addon.client.render.model.decoration;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class ArticulatedPauldronsModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create().texOffs(14, 19).addBox(-3.0F, -2.0F, -2.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(1.1F)), PartPose.offset(-4.0F, 2.0F, 0.0F));

		PartDefinition haute = right_arm.addOrReplaceChild("haute", CubeListBuilder.create().texOffs(0, 0).addBox(2.0F, -27.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 22.0F, 0.0F));

		PartDefinition cube_r1 = haute.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 11).addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -25.0F, 1.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition cube_r2 = haute.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(2, 11).addBox(0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.0F, -25.0F, -1.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create().texOffs(14, 19).mirror().addBox(-2.0F, -2.0F, -2.0F, 5.0F, 9.0F, 4.0F, new CubeDeformation(1.1F)).mirror(false), PartPose.offset(4.0F, 2.0F, 0.0F));

		PartDefinition haute2 = left_arm.addOrReplaceChild("haute2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-2.0F, -27.0F, -1.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(2.0F, 22.0F, 0.0F));

		PartDefinition cube_r3 = haute2.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(2, 11).mirror().addBox(0.0F, -2.0F, 0.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -25.0F, 1.0F, 0.0F, -0.6109F, 0.0F));

		PartDefinition cube_r4 = haute2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(2, 11).mirror().addBox(0.0F, -2.0F, -2.0F, 0.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.0F, -25.0F, -1.0F, 0.0F, 0.6109F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}
}