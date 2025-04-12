/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnMultiChoiceClickListener
 */
import android.content.DialogInterface;
import androidx.appcompat.app.f$a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.b;

/*
 * Renamed from eH
 */
public final class eh_2
implements DialogInterface.OnMultiChoiceClickListener {
    public final /* synthetic */ String[] a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ Ref$ObjectRef c;
    public final /* synthetic */ f$a d;

    public /* synthetic */ eh_2(String[] stringArray, ArrayList arrayList, Ref$ObjectRef ref$ObjectRef, f$a f$a) {
        this.a = stringArray;
        this.b = arrayList;
        this.c = ref$ObjectRef;
        this.d = f$a;
    }

    public final void onClick(DialogInterface dialogInterface, int n3, boolean n4) {
        String[] stringArray = this.a;
        Intrinsics.checkNotNullParameter(stringArray, "$subGroupArray");
        ArrayList arrayList = this.b;
        Intrinsics.checkNotNullParameter(arrayList, "$subGroupList");
        Ref$ObjectRef ref$ObjectRef = this.c;
        Intrinsics.checkNotNullParameter(ref$ObjectRef, "$selectedSubGroup");
        f$a f$a = this.d;
        Intrinsics.checkNotNullParameter(f$a, "$builder");
        if (n4 != 0) {
            Object object = stringArray[n3];
            boolean bl2 = true;
            n4 = kotlin.text.b.i((String)object, "All", bl2);
            Object object2 = "None";
            if (n4 != 0) {
                arrayList.clear();
                n3 = stringArray.length;
                object = null;
                for (n4 = 0; n4 < n3; ++n4) {
                    Object object3 = stringArray[n4];
                    boolean bl3 = kotlin.text.b.i((String)object3, (String)object2, bl2);
                    if (!bl3) {
                        object3 = n4;
                        arrayList.add(object3);
                        object3 = (boolean[])ref$ObjectRef.element;
                        object3[n4] = bl2;
                        continue;
                    }
                    object3 = (boolean[])ref$ObjectRef.element;
                    object3[n4] = false;
                }
            } else {
                object = stringArray[n3];
                n4 = kotlin.text.b.i((String)object, (String)object2, bl2);
                if (n4 != 0) {
                    arrayList.clear();
                    object = n3;
                    arrayList.add(object);
                    object = (boolean[])ref$ObjectRef.element;
                    object[n3] = bl2;
                    n4 = stringArray.length;
                    stringArray = null;
                    for (int i3 = 0; i3 < n4; ++i3) {
                        if (i3 == n3) continue;
                        object2 = (boolean[])ref$ObjectRef.element;
                        object2[i3] = false;
                    }
                } else {
                    object = n3;
                    arrayList.add(object);
                    object = (boolean[])ref$ObjectRef.element;
                    object[n3] = bl2;
                }
            }
            bx_2.p(arrayList);
        } else {
            Object object = n3;
            arrayList.remove(object);
            object = (boolean[])ref$ObjectRef.element;
            object[n3] = false;
        }
        dialogInterface.dismiss();
        f$a.show();
    }
}

