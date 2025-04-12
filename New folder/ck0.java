/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import kotlin.jvm.internal.Intrinsics;

public final class ck0
implements vv1$a {
    public static LayoutInflater a(ViewGroup viewGroup, String string2) {
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        return LayoutInflater.from((Context)viewGroup.getContext());
    }

    public void invoke(Object object) {
        ((oe)object).getClass();
    }
}

