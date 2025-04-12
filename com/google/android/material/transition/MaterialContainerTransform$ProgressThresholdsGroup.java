/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.material.transition;

import com.google.android.material.transition.MaterialContainerTransform$1;
import com.google.android.material.transition.MaterialContainerTransform$ProgressThresholds;

class MaterialContainerTransform$ProgressThresholdsGroup {
    private final MaterialContainerTransform$ProgressThresholds fade;
    private final MaterialContainerTransform$ProgressThresholds scale;
    private final MaterialContainerTransform$ProgressThresholds scaleMask;
    private final MaterialContainerTransform$ProgressThresholds shapeMask;

    private MaterialContainerTransform$ProgressThresholdsGroup(MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds, MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds2, MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds3, MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds4) {
        this.fade = materialContainerTransform$ProgressThresholds;
        this.scale = materialContainerTransform$ProgressThresholds2;
        this.scaleMask = materialContainerTransform$ProgressThresholds3;
        this.shapeMask = materialContainerTransform$ProgressThresholds4;
    }

    public /* synthetic */ MaterialContainerTransform$ProgressThresholdsGroup(MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds, MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds2, MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds3, MaterialContainerTransform$ProgressThresholds materialContainerTransform$ProgressThresholds4, MaterialContainerTransform$1 materialContainerTransform$1) {
        this(materialContainerTransform$ProgressThresholds, materialContainerTransform$ProgressThresholds2, materialContainerTransform$ProgressThresholds3, materialContainerTransform$ProgressThresholds4);
    }

    public static /* synthetic */ MaterialContainerTransform$ProgressThresholds access$400(MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup) {
        return materialContainerTransform$ProgressThresholdsGroup.fade;
    }

    public static /* synthetic */ MaterialContainerTransform$ProgressThresholds access$500(MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup) {
        return materialContainerTransform$ProgressThresholdsGroup.scale;
    }

    public static /* synthetic */ MaterialContainerTransform$ProgressThresholds access$600(MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup) {
        return materialContainerTransform$ProgressThresholdsGroup.scaleMask;
    }

    public static /* synthetic */ MaterialContainerTransform$ProgressThresholds access$700(MaterialContainerTransform$ProgressThresholdsGroup materialContainerTransform$ProgressThresholdsGroup) {
        return materialContainerTransform$ProgressThresholdsGroup.shapeMask;
    }
}

