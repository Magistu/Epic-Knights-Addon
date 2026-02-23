package com.magistuarmory.addon.client.render.model.armor;// Made with Blockbench 4.10.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

public class FoxGrotesqueMaximilianHelmetModel {

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, new CubeDeformation(0.0F))
				.texOffs(32, 0).addBox(-4.0F, -7.85F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(0.9F))
				.texOffs(38, 6).addBox(-4.0F, -7.85F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.87F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(13, 0).addBox(-1.0F, -1.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -3.6F, -8.9F, 0.0F, 0.0F, 0.7854F));

		PartDefinition VisorTopRight = head.addOrReplaceChild("VisorTopRight", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -8.0F, -5.0F, -0.7285F, 0.6374F, 0.0F));

		PartDefinition VisorTopRight_r1 = VisorTopRight.addOrReplaceChild("VisorTopRight_r1", CubeListBuilder.create().texOffs(2, 27).mirror().addBox(-6.7322F, -32.8058F, -3.293F, 6.25F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.5F, 31.6F, 5.0F, 0.0019F, 0.1311F, 0.1309F));

		PartDefinition VisorBottomRight = head.addOrReplaceChild("VisorBottomRight", CubeListBuilder.create(), PartPose.offsetAndRotation(-4.0F, -8.0F, -5.0F, 0.6829F, 0.6829F, 0.0F));

		PartDefinition VisorBottomRight_r1 = VisorBottomRight.addOrReplaceChild("VisorBottomRight_r1", CubeListBuilder.create().texOffs(0, 21).mirror().addBox(-4.5F, -3.0F, 0.0F, 9.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9075F, 4.9367F, -3.1489F, -0.0152F, 0.1215F, -0.0878F));

		PartDefinition VisorBottomLeft = head.addOrReplaceChild("VisorBottomLeft", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -8.0F, -5.0F, 0.6829F, -0.6829F, 0.0F));

		PartDefinition VisorBottomLeft_r1 = VisorBottomLeft.addOrReplaceChild("VisorBottomLeft_r1", CubeListBuilder.create().texOffs(0, 21).addBox(-4.5F, -3.0F, 0.0F, 9.0F, 6.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.9075F, 4.9367F, -3.1489F, -0.0152F, -0.1041F, 0.0875F));

		PartDefinition VisorTopLeft = head.addOrReplaceChild("VisorTopLeft", CubeListBuilder.create(), PartPose.offsetAndRotation(4.0F, -8.0F, -5.0F, -0.7285F, -0.6374F, 0.0F));

		PartDefinition VisorTopLeft_r1 = VisorTopLeft.addOrReplaceChild("VisorTopLeft_r1", CubeListBuilder.create().texOffs(2, 27).addBox(0.4822F, -32.8058F, -3.293F, 6.25F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 31.6F, 5.0F, 0.0019F, -0.1311F, -0.1309F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}