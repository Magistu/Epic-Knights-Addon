package com.magistuarmory.addon.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class SalletWithoutVisorModel {

	public SalletWithoutVisorModel() {
	}

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -7.9F, -4.2F, 8.0F, 7.0F, 8.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 1.0F, 0.1309F, 0.0F, 0.0F));

		PartDefinition Helmet_r1 = bone.addOrReplaceChild("Helmet_r1", CubeListBuilder.create().texOffs(20, 11).addBox(-0.0451F, -5.5049F, -7.2407F, 1.0F, 11.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0049F, -1.4921F, 2.2042F, 0.0F, 0.2618F, 1.5708F));

		PartDefinition Helmet_r2 = bone.addOrReplaceChild("Helmet_r2", CubeListBuilder.create().texOffs(0, 22).addBox(-0.0201F, -4.8088F, -2.2426F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0049F, -1.4921F, 2.2042F, -2.0071F, 0.2618F, 1.5708F));

		PartDefinition Helmet_r3 = bone.addOrReplaceChild("Helmet_r3", CubeListBuilder.create().texOffs(0, 22).addBox(0.0049F, -4.8225F, -3.751F, 1.0F, 4.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.0049F, -1.4921F, 2.2042F, -1.1345F, 0.2618F, 1.5708F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}