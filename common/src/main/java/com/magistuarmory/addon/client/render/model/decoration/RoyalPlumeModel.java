package com.magistuarmory.addon.client.render.model.decoration;

import com.magistuarmory.client.render.model.decoration.ArmorDecorationModel;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.world.entity.LivingEntity;

@Environment(EnvType.CLIENT)
public class RoyalPlumeModel<T extends LivingEntity> extends ArmorDecorationModel<T>
{
	public RoyalPlumeModel(ModelPart root)
	{
		super(root);
	}
	
	public static LayerDefinition createLayer() 
	{
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition Head_r1 = head.addOrReplaceChild("Head_r1", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, -0.6981F, 0.0F, 0.0F));

		PartDefinition Head_r2 = head.addOrReplaceChild("Head_r2", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, 0.0564F, 0.4054F, -0.616F));

		PartDefinition Head_r3 = head.addOrReplaceChild("Head_r3", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, 0.4104F, 0.3116F, -0.3548F));

		PartDefinition Head_r4 = head.addOrReplaceChild("Head_r4", CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, 0.4104F, -0.3116F, 0.3548F));

		PartDefinition Head_r5 = head.addOrReplaceChild("Head_r5", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, 0.0564F, -0.4054F, 0.616F));

		PartDefinition Head_r6 = head.addOrReplaceChild("Head_r6", CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, -0.4944F, -0.621F, -0.3971F));

		PartDefinition Head_r7 = head.addOrReplaceChild("Head_r7", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, -0.8617F, -0.4308F, -0.1884F));

		PartDefinition Head_r8 = head.addOrReplaceChild("Head_r8", CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, -0.8617F, 0.4308F, 0.1884F));

		PartDefinition Head_r9 = head.addOrReplaceChild("Head_r9", CubeListBuilder.create().texOffs(0, 22).addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, -0.4944F, 0.621F, 0.3971F));

		PartDefinition Head_r10 = head.addOrReplaceChild("Head_r10", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, -0.2182F, 0.0F, 0.0F));

		PartDefinition Head_r11 = head.addOrReplaceChild("Head_r11", CubeListBuilder.create().texOffs(0, 22).mirror().addBox(-4.0F, -8.9F, -0.2F, 8.0F, 9.0F, 1.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.0F, -9.0F, 2.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition hat = partdefinition.addOrReplaceChild("hat", CubeListBuilder.create(), PartPose.offset(0.0F, 26.0F, 0.0F));

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition right_arm = partdefinition.addOrReplaceChild("right_arm", CubeListBuilder.create(), PartPose.offset(-5.0F, 2.0F, 0.0F));

		PartDefinition left_arm = partdefinition.addOrReplaceChild("left_arm", CubeListBuilder.create(), PartPose.offset(5.0F, 2.0F, 0.0F));

		PartDefinition right_leg = partdefinition.addOrReplaceChild("right_leg", CubeListBuilder.create(), PartPose.offset(-1.9F, 12.0F, 0.0F));

		PartDefinition left_leg = partdefinition.addOrReplaceChild("left_leg", CubeListBuilder.create(), PartPose.offset(1.9F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 32);
	}
}