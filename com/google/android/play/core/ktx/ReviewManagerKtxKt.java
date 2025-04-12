/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
package com.google.android.play.core.ktx;

import android.app.Activity;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.ktx.ReviewManagerKtxKt$requestReview$1;
import com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$2;
import com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$1;
import com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$2;
import com.google.android.play.core.ktx.ReviewManagerKtxKt$runTask$3$3;
import com.google.android.play.core.ktx.ReviewManagerKtxKt$sam$com_google_android_gms_tasks_OnSuccessListener$0;
import com.google.android.play.core.review.ReviewInfo;
import com.google.android.play.core.review.ReviewManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class ReviewManagerKtxKt {
    public static final Object launchReview(ReviewManager object, Activity object2, ReviewInfo reviewInfo, f80_0 f80_02) {
        object = object.launchReviewFlow((Activity)object2, reviewInfo);
        Intrinsics.checkNotNullExpressionValue(object, "launchReviewFlow(...)");
        int n3 = 2;
        object = ReviewManagerKtxKt.runTask$default((Task)object, null, f80_02, n3, null);
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            return object;
        }
        return Unit.a;
    }

    /*
     * Unable to fully structure code
     */
    public static final Object requestReview(ReviewManager var0, f80_0 var1_1) {
        var2_2 = var1_1 instanceof ReviewManagerKtxKt$requestReview$1;
        if (!var2_2) ** GOTO lbl-1000
        var3_3 = var1_1;
        var3_3 = (ReviewManagerKtxKt$requestReview$1)var1_1;
        var4_4 = var3_3.label;
        var5_5 = -1 << -1;
        var6_6 = var4_4 & var5_5;
        if (var6_6 != 0) {
            var3_3.label = var4_4 -= var5_5;
        } else lbl-1000:
        // 2 sources

        {
            var3_3 = new ReviewManagerKtxKt$requestReview$1((f80_0)var1_1);
        }
        var1_1 = var3_3.result;
        var7_7 = j90_0.COROUTINE_SUSPENDED;
        var5_5 = var3_3.label;
        var6_6 = 1;
        if (var5_5 == 0) ** GOTO lbl22
        if (var5_5 == var6_6) {
            vl2_2.b(var1_1);
        } else {
            var0 = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            throw var0;
lbl22:
            // 1 sources

            vl2_2.b(var1_1);
            var0 = var0.requestReviewFlow();
            Intrinsics.checkNotNullExpressionValue(var0, "requestReviewFlow(...)");
            var3_3.label = var6_6;
            var5_5 = 2;
            var1_1 = ReviewManagerKtxKt.runTask$default((Task)var0, null, var3_3, var5_5, null);
            if (var1_1 == var7_7) {
                return var7_7;
            }
        }
        Intrinsics.checkNotNull(var1_1);
        return var1_1;
    }

    public static final Object runTask(Task object, Function0 object2, f80_0 f80_02) {
        Object object3 = zj1_2.b(f80_02);
        int n3 = 1;
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(n3, (f80_0)object3);
        cancellableContinuationImpl.r();
        object3 = new ReviewManagerKtxKt$runTask$3$1((Function0)object2);
        cancellableContinuationImpl.x((Function1)object3);
        boolean bl2 = ((Task)object).isComplete();
        if (bl2) {
            bl2 = ((Task)object).isSuccessful();
            if (bl2) {
                object = ((Task)object).getResult();
                object2 = tl2_2.b;
                cancellableContinuationImpl.resumeWith(object);
            } else {
                object = ((Task)object).getException();
                Intrinsics.checkNotNull(object);
                object = vl2_2.a((Throwable)object);
                object2 = tl2_2.b;
                cancellableContinuationImpl.resumeWith(object);
            }
        } else {
            object2 = new ReviewManagerKtxKt$runTask$3$2(cancellableContinuationImpl);
            object3 = new ReviewManagerKtxKt$sam$com_google_android_gms_tasks_OnSuccessListener$0((Function1)object2);
            ((Task)object).addOnSuccessListener((OnSuccessListener)object3);
            object2 = new ReviewManagerKtxKt$runTask$3$3(cancellableContinuationImpl);
            ((Task)object).addOnFailureListener((OnFailureListener)object2);
        }
        object = cancellableContinuationImpl.q();
        object2 = j90_0.COROUTINE_SUSPENDED;
        if (object == object2) {
            object2 = "frame";
            Intrinsics.checkNotNullParameter(f80_02, (String)object2);
        }
        return object;
    }

    public static /* synthetic */ Object runTask$default(Task task2, Function0 function0, f80_0 f80_02, int n3, Object object) {
        if ((n3 &= 2) != 0) {
            function0 = ReviewManagerKtxKt$runTask$2.INSTANCE;
        }
        return ReviewManagerKtxKt.runTask(task2, function0, f80_02);
    }

    public static final boolean tryOffer(fz2_1 fz2_12, Object object) {
        Intrinsics.checkNotNullParameter(fz2_12, "<this>");
        return fz2_12.j(object) instanceof VR$b ^ true;
    }
}

