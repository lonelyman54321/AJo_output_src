/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;

public final class Zt3$a
extends W72 {
    public final /* synthetic */ zt3_0 a;

    public Zt3$a(zt3_0 zt3_02) {
        this.a = zt3_02;
        super(true);
    }

    public final void handleOnBackPressed() {
        block6: {
            Object object = "back";
            String string2 = "upi timer interactions";
            String string3 = "upi_timer_interactions";
            String string4 = "upi_timer_screen";
            oT.b(string2, "buttonTap", (String)object, string3, string4);
            Object object2 = this.a;
            boolean bl2 = ((zt3_0)object2).h;
            if (bl2) {
                object2 = ((Fragment)object2).getActivity();
                if (object2 == null) break block6;
                object2 = ((FragmentActivity)object2).getSupportFragmentManager();
                if (object2 == null) break block6;
                try {
                    ((FragmentManager)object2).W();
                }
                catch (Exception exception) {
                    object = yn3_0.a;
                    ((yn3$a)object).e(exception);
                    Unit unit = Unit.a;
                }
            } else {
                ((zt3_0)object2).Sa();
            }
        }
    }
}

