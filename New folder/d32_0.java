/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.customviews.widgets.TextViewLinkHandler;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from d32
 */
public final class d32_0
extends TextViewLinkHandler {
    public final /* synthetic */ f32 a;

    public d32_0(f32 f322) {
        this.a = f322;
    }

    public final void onLinkClick(String string2) {
        Intrinsics.checkNotNullParameter(string2, "url");
        this.a.a.n4(string2);
    }
}

