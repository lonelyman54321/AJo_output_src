/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.Menu
 *  android.view.MenuItem
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.PopupMenu
 *  android.widget.PopupMenu$OnMenuItemClickListener
 */
import android.content.Context;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import androidx.fragment.app.Fragment;
import com.ril.ajio.remoteconfig.R$menu;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity;
import kotlin.jvm.internal.Intrinsics;

public final class n40
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ n40(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void onClick(View object) {
        object = this.c;
        boolean bl2 = false;
        Object object2 = null;
        Object object3 = this.b;
        Object object4 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object3 = (qm3_0)object3;
                Intrinsics.checkNotNullParameter(object3, (String)object4);
                object4 = ((Fragment)object3).getActivity();
                if (object4 != null) {
                    object4 = ((Fragment)object3).getActivity();
                    if (object4 != null) {
                        bl2 = object4.isFinishing();
                        object2 = bl2;
                    }
                    Intrinsics.checkNotNull(object2);
                    bl2 = (Boolean)object2;
                    if (!bl2 && (object2 = ((Fragment)object3).getActivity()) != null) {
                        object = (MenuItem)object;
                        object2.onOptionsItemSelected((MenuItem)object);
                    }
                }
                return;
            }
            case 0: 
        }
        Object object5 = ConfigEditActivity.Companion;
        object3 = (yv2_0)object3;
        object5 = "$searchHandler";
        Intrinsics.checkNotNullParameter(object3, (String)object5);
        object = (ConfigEditActivity)object;
        Intrinsics.checkNotNullParameter(object, (String)object4);
        object = object.q0;
        if (object != null) {
            object2 = object;
        } else {
            object = "toggleEdit";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        }
        object3.getClass();
        Intrinsics.checkNotNullParameter(object2, "imageView");
        object3 = ((yv2_0)object3).a;
        object = new PopupMenu((Context)object3, (View)object2);
        object2 = object.getMenuInflater();
        int n4 = R$menu.config_edit_menu;
        object5 = object.getMenu();
        object2.inflate(n4, (Menu)object5);
        bl2 = object3 instanceof PopupMenu.OnMenuItemClickListener;
        if (bl2) {
            object2 = "null cannot be cast to non-null type android.widget.PopupMenu.OnMenuItemClickListener";
            Intrinsics.checkNotNull(object3, (String)object2);
            object3 = (PopupMenu.OnMenuItemClickListener)object3;
            object.setOnMenuItemClickListener((PopupMenu.OnMenuItemClickListener)object3);
        }
        object.show();
    }
}

