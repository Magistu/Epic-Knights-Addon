package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class BellowsMaximilianHelmetModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(32, 0).addBox(-4.0F, -7.9F, -3.2F, 8.0F, 7.0F, 7.0F, new CubeDeformation(1.0F))
		.texOffs(38, 6).addBox(-4.0F, -7.9F, -3.7F, 8.0F, 7.0F, 1.0F, new CubeDeformation(0.97F)), PartPose.offset(0.0F, 1.0F, 0.0F));

		PartDefinition mask = head.addOrReplaceChild("mask", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition rmask = mask.addOrReplaceChild("rmask", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.6784F, -26.6183F, -5.5636F, 0.0F, -0.0873F, 0.0F));

		PartDefinition rmask_r1 = rmask.addOrReplaceChild("rmask_r1", CubeListBuilder.create().texOffs(0, 28).mirror().addBox(-3.2186F, -0.428F, -0.2394F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0029F, 1.6319F, -0.0035F, 0.7266F, 0.4648F, 0.0F));

		PartDefinition rmask_r2 = rmask.addOrReplaceChild("rmask_r2", CubeListBuilder.create().texOffs(0, 30).mirror().addBox(-6.9858F, 0.0F, -0.2343F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6784F, -0.3817F, -2.4364F, 0.9884F, 0.4648F, 0.0F));

		PartDefinition rmask_r3 = rmask.addOrReplaceChild("rmask_r3", CubeListBuilder.create().texOffs(0, 5).mirror().addBox(-3.4F, -7.2F, -3.75F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6784F, 2.6183F, 5.5636F, 0.552F, 0.4648F, 0.0F));

		PartDefinition rmask_r4 = rmask.addOrReplaceChild("rmask_r4", CubeListBuilder.create().texOffs(50, 30).mirror().addBox(-3.2186F, -0.894F, -0.4788F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.0029F, 1.6319F, -0.0035F, -0.552F, 0.4648F, 0.0F));

		PartDefinition rmask_r5 = rmask.addOrReplaceChild("rmask_r5", CubeListBuilder.create().texOffs(50, 31).mirror().addBox(-3.4F, -0.9F, -9.1F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.9047F, 4.5175F, 6.0149F, -0.552F, 0.4648F, 0.0F));

		PartDefinition rmask_r6 = rmask.addOrReplaceChild("rmask_r6", CubeListBuilder.create().texOffs(0, 0).mirror().addBox(-3.4F, -4.9F, -8.1F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(2.6784F, 2.6183F, 5.5636F, -0.552F, 0.4648F, 0.0F));

		PartDefinition lmask = mask.addOrReplaceChild("lmask", CubeListBuilder.create(), PartPose.offsetAndRotation(2.6784F, -26.6183F, -5.5636F, 0.0F, 0.0873F, 0.0F));

		PartDefinition lmask_r1 = lmask.addOrReplaceChild("lmask_r1", CubeListBuilder.create().texOffs(50, 30).addBox(-3.7814F, -0.894F, -0.4788F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0029F, 1.6319F, -0.0035F, -0.552F, -0.4648F, 0.0F));

		PartDefinition lmask_r2 = lmask.addOrReplaceChild("lmask_r2", CubeListBuilder.create().texOffs(0, 28).addBox(-3.7814F, -0.428F, -0.2394F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0029F, 1.6319F, -0.0035F, 0.7266F, -0.4648F, 0.0F));

		PartDefinition lmask_r3 = lmask.addOrReplaceChild("lmask_r3", CubeListBuilder.create().texOffs(0, 30).addBox(-0.0142F, 0.0F, -0.2343F, 7.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6784F, -0.3817F, -2.4364F, 0.9884F, -0.4648F, 0.0F));

		PartDefinition lmask_r4 = lmask.addOrReplaceChild("lmask_r4", CubeListBuilder.create().texOffs(0, 5).addBox(-3.6F, -7.2F, -3.75F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6784F, 2.6183F, 5.5636F, 0.552F, -0.4648F, 0.0F));

		PartDefinition lmask_r5 = lmask.addOrReplaceChild("lmask_r5", CubeListBuilder.create().texOffs(50, 31).addBox(-3.6F, 0.1F, -8.1F, 7.0F, 1.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.7581F, 3.1416F, 5.7225F, -0.552F, -0.4648F, 0.0F));

		PartDefinition lmask_r6 = lmask.addOrReplaceChild("lmask_r6", CubeListBuilder.create().texOffs(0, 0).addBox(-3.6F, -4.9F, -8.1F, 7.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.6784F, 2.6183F, 5.5636F, -0.552F, -0.4648F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}
