/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.SelectedOrderItem;
import com.ril.ajio.services.data.fleek.feedModel.ResourceOwner;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from JE1
 */
public final class je1_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ je1_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final Object invoke(Object object) {
        int n3 = 3;
        int n4 = 0;
        Object object2 = null;
        Object object3 = "$viewModel";
        int n7 = 4;
        String string2 = null;
        Object object4 = this.c;
        Object object5 = this.b;
        int n8 = 1;
        int n10 = this.a;
        switch (n10) {
            default: {
                object = (r50)object;
                object5 = (t50)object5;
                Intrinsics.checkNotNullParameter(object5, "$brandDescriptionComposable");
                Intrinsics.checkNotNullParameter(object, "$this$constrain");
                Object object6 = ((r50)object).g;
                object2 = ((t50)object5).d;
                float f5 = uq0_0.e;
                float f6 = uq0_0.o;
                ((hw_0)object6).a((y50$a_0)object2, f5, f6);
                object6 = ((r50)object).c;
                object2 = ((t50)object6).c;
                object3 = ((r50)object).d;
                sb3_0.a((tb3_0)object3, (y50$b_0)object2, f6, n7);
                object6 = ((t50)object6).e;
                sb3_0.a(((r50)object).f, (y50$b_0)object6, f6, n7);
                object2 = "spread";
                object6 = new zq0_0((String)object2);
                ((r50)object).b((zq0_0)object6);
                object4 = (Subcomponent)object4;
                if (object4 != null && (object6 = object4.getResourceOwner()) != null) {
                    string2 = ((ResourceOwner)object6).getName();
                }
                object6 = string2 != null && (n3 = string2.length()) != 0 ? tE3.b : tE3.c;
                object2 = r50.k[2];
                object = ((r50)object).j;
                object.getClass();
                object3 = "property";
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                Object object7 = ((y62_0)object).b;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((y62_0)object).b = object6;
                ((r50$b)object).c((gn1_2)object2, object7, object6);
                return Unit.a;
            }
            case 1: {
                Object object8 = object;
                object8 = (String)object;
                object = object5;
                object = (qz1_2)object5;
                Intrinsics.checkNotNullParameter(object, (String)object3);
                int n14 = TextUtils.isEmpty((CharSequence)object8);
                object5 = "format(...)";
                if (n14 != 0) {
                    object = StringCompanionObject.INSTANCE;
                    int n15 = R$string.acc_error_message;
                    object = hv3_0.K(n15);
                    String string3 = "Invoice Number should not be blank.";
                    object3 = new Object[n8];
                    object3[0] = string3;
                    object = xh2_0.a(object3, n8, (String)object, (String)object5);
                    hv3_0.o0(n8, string3, (String)object);
                } else {
                    Intrinsics.checkNotNull(object8);
                    n14 = ((String)object8).length();
                    if (n14 != n7) {
                        object = StringCompanionObject.INSTANCE;
                        int n16 = R$string.acc_error_message;
                        object = hv3_0.K(n16);
                        String string4 = "Invoice Number should be 4 digits.";
                        object3 = new Object[n8];
                        object3[0] = string4;
                        object = xh2_0.a(object3, n8, (String)object, (String)object5);
                        hv3_0.o0(n8, string4, (String)object);
                    } else {
                        Object object9;
                        object.getClass();
                        Intrinsics.checkNotNullParameter(object8, "invoiceNumber");
                        Object object10 = object2 = ((qz1_2)object).d.getValue();
                        object10 = (String)object2;
                        Object object11 = object4;
                        object11 = (SelectedOrderItem)object4;
                        if (object11 != null && (object2 = object11.getConsignment()) != null) {
                            object9 = object2 = ((Consignment)object2).getCode();
                        } else {
                            n10 = 0;
                            object9 = null;
                        }
                        if (object10 != null && (n4 = ((String)object10).length()) != 0 && object9 != null && (n4 = ((String)object9).length()) != 0) {
                            object2 = ((qz1_2)object).c;
                            object3 = Boolean.TRUE;
                            ((h83_0)object2).setValue(object3);
                            object2 = md3_0.c((jD3)object);
                            object4 = object3;
                            object5 = object;
                            object3 = new zz1_2((qz1_2)object, (String)object10, (String)object9, (String)object8, (SelectedOrderItem)object11, null);
                            Ae3.d((i90_0)object2, null, null, (Function2)object3, n3);
                        }
                        LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<Object, Object>();
                        object2 = Boolean.FALSE;
                        linkedHashMap.put(object2, null);
                        object = ((qz1_2)object).j;
                        ((h83_0)object).setValue(linkedHashMap);
                    }
                }
                return Unit.a;
            }
            case 0: 
        }
        object = (dt1_0)object;
        object5 = (p83_0)object5;
        Intrinsics.checkNotNullParameter(object5, "$expandableList");
        object4 = (bf1_2)object4;
        Intrinsics.checkNotNullParameter(object4, (String)object3);
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        n4 = ((p83_0)object5).size();
        object3 = new UE1$b((p83_0)object5, (bf1_2)object4);
        u10 u102 = new u10(38460097, object3, n8 != 0);
        bt1.b((dt1_0)object, n4, null, u102, 6);
        object2 = X10.a;
        bt1.a((dt1_0)object, null, (gx0_2)object2, n3);
        return Unit.a;
    }
}

