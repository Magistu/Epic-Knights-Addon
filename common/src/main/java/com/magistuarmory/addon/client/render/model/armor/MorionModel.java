package com.magistuarmory.addon.client.render.model.armor;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@Environment(EnvType.CLIENT)
public class MorionModel
{
	public static LayerDefinition createLayer()
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.7F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition bone = head.addOrReplaceChild("bone", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -4.0F, 0.0F, -0.1309F, 0.0F, 0.0F));

		PartDefinition head2 = bone.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition head2_r1 = head2.addOrReplaceChild("head2_r1", CubeListBuilder.create().texOffs(0, 17).addBox(-1.9192F, -0.9085F, -7.7653F, 7.0F, 1.0F, 14.0F, new CubeDeformation(0.6F)), PartPose.offsetAndRotation(-4.4973F, 1.3169F, 0.7329F, 0.0F, 0.0F, -0.2531F));

		PartDefinition head3 = bone.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition head2_r2 = head3.addOrReplaceChild("head2_r2", CubeListBuilder.create().texOffs(0, 17).mirror().addBox(-5.0808F, -0.9085F, -7.7653F, 7.0F, 1.0F, 14.0F, new CubeDeformation(0.6F)).mirror(false), PartPose.offsetAndRotation(4.4973F, 1.3169F, 0.7329F, 0.0F, 0.0F, 0.2531F));

		PartDefinition head1 = bone.addOrReplaceChild("head1", CubeListBuilder.create().texOffs(22, 17).mirror().addBox(0.3974F, 0.8828F, -7.0F, 7.0F, 1.0F, 14.0F, new CubeDeformation(0.6F)).mirror(false), PartPose.offsetAndRotation(-0.2957F, -1.8564F, -0.0323F, 0.0F, 0.0F, -1.5708F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}