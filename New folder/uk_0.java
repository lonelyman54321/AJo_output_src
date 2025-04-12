/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.animation.Animator
 *  android.animation.AnimatorListenerAdapter
 */
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import java.util.ArrayList;

/*
 * Renamed from Uk
 */
public final class uk_0
extends AnimatorListenerAdapter {
    public final /* synthetic */ tk_0 a;

    public uk_0(tk_0 tk_02) {
        this.a = tk_02;
    }

    public final void onAnimationEnd(Animator object) {
        tk_0 tk_02 = this.a;
        ArrayList arrayList = tk_02.e;
        object = new ArrayList(arrayList);
        int n3 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Mj mj = (Mj)((ArrayList)object).get(i3);
            mj.onAnimationEnd(tk_02);
        }
    }

    public final void onAnimationStart(Animator object) {
        tk_0 tk_02 = this.a;
        ArrayList arrayList = tk_02.e;
        object = new ArrayList(arrayList);
        int n3 = ((ArrayList)object).size();
        for (int i3 = 0; i3 < n3; ++i3) {
            Mj mj = (Mj)((ArrayList)object).get(i3);
            mj.onAnimationStart(tk_02);
        }
    }
}

