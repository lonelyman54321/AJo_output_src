/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.TextUtils
 *  android.text.TextWatcher
 */
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.remoteconfig.devsettings.Data;
import com.ril.ajio.remoteconfig.devsettings.view.ConfigEditActivity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from r40
 */
public final class r40_0
implements TextWatcher {
    public final /* synthetic */ ConfigEditActivity a;

    public r40_0(ConfigEditActivity configEditActivity) {
        this.a = configEditActivity;
    }

    public final void afterTextChanged(Editable object) {
        Intrinsics.checkNotNullParameter(object, "text");
        object = object.toString();
        Object object2 = ConfigEditActivity.Companion;
        object2 = this.a;
        object2.getClass();
        Object object3 = ((ConfigEditActivity)object2).Z;
        int n3 = ((HashMap)object3).size();
        ArrayList<Object> arrayList = new ArrayList<Object>(n3);
        object3 = ((HashMap)object3).entrySet().iterator();
        while ((n3 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            Object object4 = (Map.Entry)object3.next();
            String string2 = (String)object4.getKey();
            object4 = (Data)object4.getValue();
            boolean bl2 = StringsKt.F(string2, (CharSequence)object, false);
            if (!bl2) {
                string2 = ((Data)object4).c;
                boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
                if (bl3) {
                    string2 = ((Data)object4).b;
                }
                string2 = String.valueOf(string2).toLowerCase();
                String string3 = "toLowerCase(...)";
                Intrinsics.checkNotNullExpressionValue(string2, string3);
                bl2 = StringsKt.F(string2, (CharSequence)object, false);
                if (!bl2) continue;
            }
            arrayList.add(object4);
        }
        object2 = ((ConfigEditActivity)object2).Y;
        if (object2 != null) {
            object3 = "updatedList";
            Intrinsics.checkNotNullParameter(arrayList, (String)object3);
            if (object != null) {
                ((i40)object2).d = object;
            }
            object = ((i40)object2).c;
            ((ArrayList)object).clear();
            ((ArrayList)object).addAll(arrayList);
            ((RecyclerView$f)object2).notifyDataSetChanged();
        }
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Intrinsics.checkNotNullParameter(charSequence, "s");
    }
}

