/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.sidesheet.SideSheetBehavior;

public final class s43
implements Runnable {
    public final /* synthetic */ SideSheetBehavior a;
    public final /* synthetic */ int b;

    public /* synthetic */ s43(SideSheetBehavior sideSheetBehavior, int n3) {
        this.a = sideSheetBehavior;
        this.b = n3;
    }

    public final void run() {
        SideSheetBehavior sideSheetBehavior = this.a;
        int n3 = this.b;
        SideSheetBehavior.b(sideSheetBehavior, n3);
    }
}

