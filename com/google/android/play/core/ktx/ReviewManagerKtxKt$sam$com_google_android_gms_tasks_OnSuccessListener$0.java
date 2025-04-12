/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

final class ReviewManagerKtxKt$sam$com_google_android_gms_tasks_OnSuccessListener$0
implements OnSuccessListener {
    private final /* synthetic */ Function1 function;

    public ReviewManagerKtxKt$sam$com_google_android_gms_tasks_OnSuccessListener$0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "function");
        this.function = function1;
    }

    public final /* synthetic */ void onSuccess(Object object) {
        this.function.invoke(object);
    }
}

