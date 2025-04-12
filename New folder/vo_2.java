/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import com.google.android.gms.tasks.OnSuccessListener;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.HomeRepo;
import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from vo
 */
public final class vo_2
implements OnSuccessListener,
o60_0,
w3 {
    public final /* synthetic */ Object a;

    public /* synthetic */ vo_2(Object object) {
        this.a = object;
    }

    public void a(Object object) {
        Object object2 = null;
        int n3 = 1;
        Object object3 = object;
        object3 = (ActivityResult)object;
        lr1_0 lr1_02 = (lr1_0)this.a;
        Intrinsics.checkNotNullParameter(lr1_02, "this$0");
        ArrayList<Uri> arrayList = "it";
        Intrinsics.checkNotNullParameter(object3, (String)((Object)arrayList));
        int n4 = ((ActivityResult)object3).a;
        int n7 = -1;
        if (n4 == n7 && (object3 = ((ActivityResult)object3).b) != null) {
            arrayList = new ArrayList<Uri>();
            Object object4 = object3.getClipData();
            String string2 = "format(...)";
            Object[] objectArray = "getString(...)";
            if (object4 != null) {
                int n8 = object4.getItemCount();
                for (int i3 = 0; i3 < n8; i3 += n3) {
                    Object object5;
                    Object object6 = object4.getItemAt(i3).getUri();
                    int n10 = lr1_02.a((Uri)object6);
                    Object object7 = lr1_02.a;
                    if (n10 != 0) {
                        Intrinsics.checkNotNull(object6);
                        String[] stringArray = new String[]{"_data"};
                        object5 = object7.getContentResolver();
                        object7 = object6;
                        object5 = object5.query(object6, stringArray, null, null, null);
                        if (object5 != null) {
                            int n14 = object5.moveToFirst();
                            if (n14 != 0) {
                                object7 = stringArray[0];
                                n14 = object5.getColumnIndexOrThrow((String)object7);
                                object5.getString(n14);
                            }
                            object5.close();
                        }
                        if ((object6 = lr1_02.b((Uri)object6)) == null) continue;
                        arrayList.add((Uri)object6);
                        continue;
                    }
                    int n15 = lr1_02.f;
                    if (n15 != 0) continue;
                    lr1_02.f = n3;
                    n15 = R$string.file_type_invalid;
                    object6 = object7.getString(n15);
                    Intrinsics.checkNotNullExpressionValue(object6, (String)objectArray);
                    object5 = StringCompanionObject.INSTANCE;
                    n10 = R$string.acc_error_message;
                    object5 = hv3_0.K(n10);
                    object7 = new Object[n3];
                    object7[0] = object6;
                    object5 = xh2_0.a((Object[])object7, n3, (String)object5, string2);
                    object7 = hv3_0.a;
                    object7.getClass();
                    hv3_0.l0((String)object6, (String)object5);
                }
            } else if ((object3 = object3.getData()) != null) {
                n7 = (int)(lr1_02.a((Uri)object3) ? 1 : 0);
                if (n7 != 0) {
                    object2 = object3.getPath();
                    if (object2 != null && (object2 = lr1_02.b((Uri)object3)) != null) {
                        arrayList.add((Uri)object2);
                    }
                } else {
                    boolean bl2 = lr1_02.f;
                    if (!bl2) {
                        lr1_02.f = n3;
                        object3 = lr1_02.a;
                        n7 = R$string.file_type_invalid;
                        object3 = object3.getString(n7);
                        Intrinsics.checkNotNullExpressionValue(object3, (String)objectArray);
                        object4 = StringCompanionObject.INSTANCE;
                        n7 = R$string.acc_error_message;
                        object4 = hv3_0.K(n7);
                        objectArray = new Object[n3];
                        objectArray[0] = object3;
                        object2 = xh2_0.a(objectArray, n3, (String)object4, string2);
                        hv3_0 hv3_02 = hv3_0.a;
                        hv3_02.getClass();
                        hv3_0.l0((String)object3, (String)object2);
                    } else {
                        yn3$a yn3$a = yn3_0.a;
                        object3 = "Already shown";
                        object2 = new Object[]{};
                        yn3$a.a((String)object3, object2);
                    }
                }
            }
            object2 = lr1_02.b;
            object2.V7(arrayList);
        }
    }

    public void accept(Object object) {
        HomeRepo.S((g81_0)((Function1)this.a), object);
    }

    public void onSuccess(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

