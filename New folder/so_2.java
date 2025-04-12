/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnKeyListener
 *  android.view.KeyEvent
 */
import android.content.DialogInterface;
import android.view.KeyEvent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from sO
 */
public final class so_2
implements DialogInterface.OnKeyListener {
    public final /* synthetic */ uo_2 a;

    public /* synthetic */ so_2(uo_2 uo_22) {
        this.a = uo_22;
    }

    public final boolean onKey(DialogInterface object, int n3, KeyEvent keyEvent) {
        Object object2 = uo_2.Companion;
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        String string2 = "<unused var>";
        Intrinsics.checkNotNullParameter(object, string2);
        object = "keyEvent";
        Intrinsics.checkNotNullParameter(keyEvent, (String)object);
        int n4 = 4;
        if (n3 == n4 && (n4 = keyEvent.getAction()) == (n3 = 1)) {
            object = ((Fragment)object2).getChildFragmentManager();
            n4 = ((FragmentManager)object).J();
            if (n4 > 0) {
                object = ((Fragment)object2).getChildFragmentManager();
                ((FragmentManager)object).W();
            } else {
                ((BottomSheetDialogFragment)object2).dismiss();
            }
        } else {
            n3 = 0;
        }
        return n3 != 0;
    }
}

