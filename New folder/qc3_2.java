/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.text.LineBreakConfig
 *  android.text.StaticLayout
 *  android.text.StaticLayout$Builder
 */
import android.graphics.text.LineBreakConfig;
import android.text.StaticLayout;

/*
 * Renamed from qc3
 */
public final class qc3_2 {
    public static final boolean a(StaticLayout staticLayout) {
        return kc3_0.a(staticLayout);
    }

    public static final void b(StaticLayout.Builder builder, int n3, int n4) {
        LineBreakConfig lineBreakConfig = nc3_0.a(mc3.a(lc3.a(pc3_2.a(), n3), n4));
        oc3_1.a(builder, lineBreakConfig);
    }
}

