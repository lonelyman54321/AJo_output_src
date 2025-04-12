/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.activity.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class YD3 {
    public static final void a(View view, h82_0 h82_02) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        Intrinsics.checkNotNullParameter(h82_02, "onBackPressedDispatcherOwner");
        int n3 = R$id.view_tree_on_back_pressed_dispatcher_owner;
        view.setTag(n3, (Object)h82_02);
    }
}

