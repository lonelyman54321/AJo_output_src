/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Payment.PaymentInstrumentInfo;
import com.ril.ajio.services.data.Payment.PriceSplitUp;
import com.ril.ajio.services.data.Payment.PriceValidation;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Cy0
 */
public final class cy0_1
extends zv_0 {
    public final jy0_1 d;
    public final float e;

    public cy0_1(ArrayList arrayList, jy0_1 jy0_12, float f5, op2_2 op2_22, mu1_1 mu1_12, kj2_1 kj2_12) {
        Intrinsics.checkNotNullParameter(jy0_12, "listener");
        super(arrayList, op2_22, mu1_12, kj2_12);
        this.d = jy0_12;
        this.e = f5;
    }

    public final int getItemCount() {
        int n3;
        List list = this.a;
        if (list != null) {
            n3 = list.size();
        } else {
            n3 = 0;
            list = null;
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        ay0_1 ay0_12 = null;
        int n4 = 1;
        Object object = "viewHolder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        List list = this.a;
        if (list != null) {
            Object[] objectArray = (PaymentInstrumentInfo)list.get(n3);
            RecyclerView$B recyclerView$B2 = recyclerView$B;
            recyclerView$B2 = (Cy0$a)recyclerView$B;
            Intrinsics.checkNotNullParameter(recyclerView$B2, (String)object);
            boolean bl2 = recyclerView$B2 instanceof Cy0$a;
            if (bl2) {
                int n7;
                int n8;
                Object object2;
                Object object3;
                float f5;
                object = recyclerView$B2.itemView;
                Object object4 = n3;
                object.setTag(object4);
                object = ((Cy0$a)recyclerView$B2).a;
                int n10 = 0;
                float f6 = 0.0f;
                object4 = null;
                String string2 = objectArray != null ? objectArray.getName() : null;
                object.setText((CharSequence)string2);
                if (objectArray != null && (object = objectArray.getPriceValidation()) != null && (object = ((PriceValidation)object).getPriceSplitup()) != null) {
                    object = ((PriceSplitUp)object).getNetPayableAmount();
                } else {
                    bl2 = false;
                    object = null;
                    f5 = 0.0f;
                }
                string2 = ((Cy0$a)recyclerView$B2).d;
                float f7 = this.e;
                String string3 = "format(...)";
                String string4 = "PAY \u20b9%s SECURELY";
                if (object == null) {
                    object3 = StringCompanionObject.INSTANCE;
                    object3 = kq2_1.a(f7);
                    object2 = new Object[n4];
                    object2[0] = object3;
                    zn0_1.b(object2, n4, string4, string3, (TextView)string2);
                } else {
                    object3 = StringCompanionObject.INSTANCE;
                    float f8 = ((Float)object).floatValue();
                    object3 = kq2_1.a(f8);
                    object2 = new Object[n4];
                    object2[0] = object3;
                    zn0_1.b(object2, n4, string4, string3, (TextView)string2);
                }
                object3 = new da$a();
                ((da$a)object3).k = n4;
                ((da$a)object3).g = n4;
                if (objectArray != null) {
                    object4 = objectArray.getIconURL();
                }
                ((da$a)object3).n = object4;
                object4 = ((Cy0$a)recyclerView$B2).b;
                ((da$a)object3).u = object4;
                ((da$a)object3).a();
                if (objectArray != null) {
                    object4 = objectArray.getDisabled();
                    object3 = Boolean.TRUE;
                    n10 = Intrinsics.areEqual(object4, object3);
                } else {
                    n10 = 0;
                    f6 = 0.0f;
                    object4 = null;
                }
                object3 = ((Cy0$a)recyclerView$B2).e;
                object2 = ((Cy0$a)recyclerView$B2).f;
                if (n10 != 0) {
                    recyclerView$B2.itemView.setClickable(false);
                    object4 = recyclerView$B2.itemView;
                    object4.setEnabled(false);
                    if (object3 != null) {
                        n10 = 0x3F000000;
                        f6 = 0.5f;
                        object3.setAlpha(f6);
                    }
                    if (object2 != null) {
                        AJIOApplication.Companion.getClass();
                        object4 = AJIOApplication$a.a();
                        n8 = R$string.emi_not_available;
                        object4 = object4.getString(n8);
                        object2.setText((CharSequence)object4);
                    }
                    if (object2 != null) {
                        ai0_2.B((View)object2);
                    }
                } else {
                    recyclerView$B2.itemView.setClickable(n4 != 0);
                    object4 = recyclerView$B2.itemView;
                    object4.setEnabled(n4 != 0);
                    if (object3 != null) {
                        n10 = 1065353216;
                        f6 = 1.0f;
                        object3.setAlpha(f6);
                    }
                    if (object2 != null) {
                        ai0_2.i((View)object2);
                    }
                }
                if (objectArray != null) {
                    objectArray = objectArray.getNo_cost_emi_enabled();
                    object4 = Boolean.TRUE;
                    n7 = Intrinsics.areEqual(objectArray, object4);
                } else {
                    n7 = 0;
                    objectArray = null;
                }
                object4 = ((Cy0$a)recyclerView$B2).g;
                if (n7 != 0) {
                    if (object4 != null) {
                        AJIOApplication.Companion.getClass();
                        objectArray = AJIOApplication$a.a();
                        n8 = R$string.emi_available;
                        objectArray = objectArray.getString(n8);
                        object4.setText((CharSequence)objectArray);
                    }
                    if (object4 != null) {
                        ai0_2.B((View)object4);
                    }
                } else if (object4 != null) {
                    ai0_2.i((View)object4);
                }
                if ((n7 = og1_1.c()) != 0 && object4 != null && (n7 = object4.getVisibility()) == 0 && object2 != null && (n7 = object2.getVisibility()) == 0) {
                    n7 = object4.getPaddingLeft();
                    n8 = object4.getPaddingRight();
                    int n14 = object4.getPaddingBottom();
                    object4.setPadding(n7, 0, n8, n14);
                }
                n7 = this.c;
                recyclerView$B2 = ((Cy0$a)recyclerView$B2).c;
                if (n3 == n7) {
                    recyclerView$B2.setVisibility(0);
                } else {
                    n7 = 8;
                    recyclerView$B2.setVisibility(n7);
                    if (object == null) {
                        object = kq2_1.a(f7);
                        objectArray = new Object[n4];
                        objectArray[0] = object;
                        zn0_1.b(objectArray, n4, string4, string3, (TextView)string2);
                    } else {
                        f5 = ((Float)object).floatValue();
                        object = kq2_1.a(f5);
                        objectArray = new Object[n4];
                        objectArray[0] = object;
                        zn0_1.b(objectArray, n4, string4, string3, (TextView)string2);
                    }
                    object = kq2_1.a(f7);
                    objectArray = new Object[n4];
                    objectArray[0] = object;
                    zn0_1.b(objectArray, n4, string4, string3, (TextView)string2);
                }
            }
            recyclerView$B = recyclerView$B.itemView;
            list = (ArrayList)list;
            ay0_12 = new ay0_1(this, n3, (ArrayList)list);
            recyclerView$B.setOnClickListener(ay0_12);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        String string2 = "viewGroup";
        Intrinsics.checkNotNullParameter(viewGroup, string2);
        boolean bl2 = og1_1.b();
        if (bl2) {
            string2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n4 = R$layout.pesdk_luxe_emi_row;
            viewGroup = string2.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
        } else {
            string2 = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.pesdk_emi_row;
            viewGroup = string2.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
        }
        Object object = n3;
        viewGroup.setTag(object);
        object = new Cy0$a(this, (View)viewGroup);
        return object;
    }
}

