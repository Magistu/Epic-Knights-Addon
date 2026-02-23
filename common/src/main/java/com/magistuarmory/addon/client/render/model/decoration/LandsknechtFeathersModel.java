package com.magistuarmory.addon.client.render.model.decoration;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class LandsknechtFeathersModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(1.0F, 0.0F, 0.0F));

		PartDefinition head2 = head.addOrReplaceChild("head2", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, -6.0F, -1.0F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(2.8F, -7.0F, -2.0F, -0.0627F, 0.5009F, 0.435F));

		PartDefinition head4 = head.addOrReplaceChild("head4", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, -6.0F, -1.0F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(2.8F, -7.0F, -2.0F, 0.4261F, -0.4632F, -0.3307F));

		PartDefinition head5 = head.addOrReplaceChild("head5", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, -6.0F, -1.0F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(2.8F, -7.0F, -2.0F, 0.4308F, 0.0171F, 0.4867F));

		PartDefinition head3 = head.addOrReplaceChild("head3", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, -6.0F, -1.0F, 1.0F, 6.0F, 10.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(2.8F, -7.0F, -2.0F, 0.3543F, -0.5037F, 0.1807F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}