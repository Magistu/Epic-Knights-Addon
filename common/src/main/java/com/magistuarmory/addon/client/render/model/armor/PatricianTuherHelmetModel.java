package com.magistuarmory.addon.client.render.model.armor;

import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;


public class PatricianTuherHelmetModel {

	public PatricianTuherHelmetModel() {
	}

	public static LayerDefinition createLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(38, 6).addBox(-4.0F, -7.9F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.97F))
		.texOffs(32, 0).addBox(-4.0F, -7.9F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(1.0F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rmask = mask.addOrReplaceChild("rmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition rmask_r1 = rmask.addOrReplaceChild("rmask_r1", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-3.4F, -7.2F, -3.75F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -24.0F, 0.0F, 0.552F, 0.4648F, 0.0F));

		PartDefinition rmask_r2 = rmask.addOrReplaceChild("rmask_r2", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-6.9858F, -5.2446F, 0.0868F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -28.0F, -8.0F, -0.552F, 0.4648F, 0.0F));

		PartDefinition lmask = mask.addOrReplaceChild("lmask", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition lmask_r1 = lmask.addOrReplaceChild("lmask_r1", CubeListBuilder.create().texOffs(0, 29).addBox(-0.0142F, 0.1048F, -0.2343F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(0.0F, -27.0F, -8.0F, 0.5293F, -0.5984F, -0.0743F));

		PartDefinition lmask_r2 = lmask.addOrReplaceChild("lmask_r2", CubeListBuilder.create().texOffs(0, 29).mirror().addBox(-5.9858F, 0.1048F, -0.2343F, 6.0F, 2.0F, 1.0F, new CubeDeformation(0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, -27.0F, -8.0F, 0.5505F, 0.5931F, 0.0863F));

		PartDefinition lmask_r3 = lmask.addOrReplaceChild("lmask_r3", CubeListBuilder.create().texOffs(0, 5).addBox(-3.6F, -7.2F, -3.75F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.0F, 0.0F, 0.552F, -0.4648F, 0.0F));

		PartDefinition lmask_r4 = lmask.addOrReplaceChild("lmask_r4", CubeListBuilder.create().texOffs(0, 0).addBox(-3.6F, -4.9F, -8.1F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -24.0F, 0.0F, -0.552F, -0.4648F, 0.0F));
		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}