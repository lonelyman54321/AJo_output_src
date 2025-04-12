/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.RoundedCorner
 *  android.view.WindowInsets
 *  android.view.translation.TranslationRequestValue
 *  android.view.translation.ViewTranslationRequest$Builder
 */
import android.view.RoundedCorner;
import android.view.WindowInsets;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;

public final class Sg {
    public static /* bridge */ /* synthetic */ RoundedCorner a(WindowInsets windowInsets, int n3) {
        return windowInsets.getRoundedCorner(n3);
    }

    public static /* bridge */ /* synthetic */ void b(ViewTranslationRequest.Builder builder, TranslationRequestValue translationRequestValue) {
        builder.setValue("android:text", translationRequestValue);
    }
}

