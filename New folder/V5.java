/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.k$e;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.ajiocash.ActivePoints;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class V5
extends Ql2 {
    public static final V5$b Companion;
    public static final V5$a e;
    public final ja2_1 d;

    static {
        Object object = new Object();
        Companion = object;
        e = object = new k$e();
    }

    public V5(ja2_1 ja2_12) {
        Intrinsics.checkNotNullParameter(ja2_12, "orderClickListener");
        V5$a v5$a = e;
        super(v5$a);
        this.d = ja2_12;
    }

    public final int getItemViewType(int n3) {
        n3 = n3 == 0 ? 2 : 1;
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        Object object = recyclerView$B;
        int n4 = n3;
        int n7 = 1;
        Object object2 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object2);
        boolean bl2 = recyclerView$B instanceof X5;
        Object object3 = null;
        if (bl2) {
            object = (X5)recyclerView$B;
            object2 = this;
            ActivePoints activePoints = (ActivePoints)this.h(n3);
            if (activePoints != null) {
                Object object4;
                CharSequence charSequence;
                int n8;
                Object object5 = ((X5)object).b;
                Object object6 = activePoints.getTransactionDescription();
                object5.setText((CharSequence)object6);
                object5 = activePoints.getTransactionSubDescription();
                object6 = ((X5)object).c;
                int n10 = 8;
                if (object5 != null && (n8 = ((String)object5).length()) != 0) {
                    object5 = activePoints.getTransactionSubDescription();
                    object6.setText((CharSequence)object5);
                    object6.setVisibility(0);
                    object5 = activePoints.getOrderId();
                    if (object5 != null && (n8 = ((String)object5).length()) != 0) {
                        object5 = new W5((X5)object, activePoints);
                        object6.setOnClickListener((View.OnClickListener)object5);
                        n8 = hv3_0.m(R$color.accent_color_4);
                        object6.setTextColor(n8);
                    } else {
                        n8 = hv3_0.m(R$color.accent_color_10);
                        object6.setTextColor(n8);
                    }
                    object5 = activePoints.getTransactionSubDescription();
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object5);
                    object5 = " index ";
                    ((StringBuilder)charSequence).append((String)object5);
                    ((StringBuilder)charSequence).append(n4);
                    object4 = ((StringBuilder)charSequence).toString();
                    object6.setContentDescription((CharSequence)object4);
                } else {
                    object6.setVisibility(n10);
                }
                object4 = activePoints.getTransactionReason();
                n4 = (int)(Intrinsics.areEqual(object4, "ACTIVATION") ? 1 : 0);
                object5 = "  |  %s%s";
                object6 = "+ %s";
                String string2 = "%s%s";
                Object[] objectArray = ((X5)object).h;
                TextView textView = ((X5)object).e;
                TextView textView2 = ((X5)object).f;
                TextView textView3 = ((X5)object).g;
                charSequence = "format(...)";
                ImageView imageView = ((X5)object).i;
                object = ((X5)object).d;
                if (n4 != 0) {
                    int n14;
                    float f5;
                    object4 = StringCompanionObject.INSTANCE;
                    object4 = activePoints.getAmount();
                    if (object4 != null) {
                        f5 = ((Float)object4).floatValue();
                    } else {
                        n4 = 0;
                        f5 = 0.0f;
                        object4 = null;
                    }
                    object4 = qz2_0.x(Float.valueOf(f5));
                    Object[] objectArray2 = new Object[n7];
                    objectArray2[0] = object4;
                    zn0_1.b(objectArray2, n7, (String)object6, (String)charSequence, textView2);
                    ai0_2.B((View)textView2);
                    object4 = activePoints.isExpired();
                    object6 = Boolean.TRUE;
                    n4 = (int)(Intrinsics.areEqual(object4, object6) ? 1 : 0);
                    if (n4 != 0) {
                        object4 = cp_1.Companion;
                        n4 = (int)(km_1.b((cp$a)object4) ? 1 : 0);
                        if (n4 == 0) {
                            objectArray.setVisibility(0);
                        }
                        object.setVisibility(0);
                        n4 = 8;
                        f5 = 1.1E-44f;
                        textView.setVisibility(n4);
                        n8 = R$string.expired_on;
                        object5 = hv3_0.K(n8);
                        objectArray2 = k7.k(activePoints.getExpiryDate());
                        int n15 = 2;
                        objectArray = new Object[n15];
                        objectArray[0] = object5;
                        objectArray[n7] = objectArray2;
                        zn0_1.b(objectArray, n15, string2, (String)charSequence, (TextView)object);
                    } else {
                        f5 = 1.1E-44f;
                        int n16 = 2;
                        objectArray.setVisibility(8);
                        object.setVisibility(0);
                        textView.setVisibility(0);
                        n4 = R$string.activated;
                        object4 = hv3_0.K(n4);
                        objectArray2 = k7.k(activePoints.getActivationDate());
                        objectArray = new Object[n16];
                        objectArray[0] = object4;
                        objectArray[n7] = objectArray2;
                        zn0_1.b(objectArray, n16, string2, (String)charSequence, (TextView)object);
                        n14 = R$string.expires;
                        object = hv3_0.K(n14);
                        object4 = k7.k(activePoints.getExpiryDate());
                        objectArray2 = new Object[n16];
                        objectArray2[0] = object;
                        objectArray2[n7] = object4;
                        zn0_1.b(objectArray2, n16, (String)object5, (String)charSequence, textView);
                    }
                    object = activePoints.isImageIcon();
                    n14 = (int)(Intrinsics.areEqual(object, object6) ? 1 : 0);
                    if (n14 != 0) {
                        n14 = 8;
                        textView3.setVisibility(n14);
                        imageView.setVisibility(0);
                        object = new da$a();
                        ((da$a)object).k = n7;
                        ((da$a)object).b = n4 = R$drawable.component_placeholder;
                        ((da$a)object).n = object4 = activePoints.getImageUrl();
                        ((da$a)object).u = imageView;
                        ((da$a)object).a();
                    } else {
                        textView3.setVisibility(0);
                        n14 = 4;
                        imageView.setVisibility(n14);
                        object = activePoints.getIconTextDisplay();
                        textView3.setText((CharSequence)object);
                    }
                } else {
                    object4 = activePoints.getTransactionReason();
                    n4 = (int)(Intrinsics.areEqual(object4, "EXPIRY") ? 1 : 0);
                    Object[] objectArray3 = "- %s";
                    if (n4 != 0) {
                        float f6;
                        object4 = cp_1.Companion;
                        n4 = (int)(km_1.b((cp$a)object4) ? 1 : 0);
                        if (n4 == 0) {
                            objectArray.setVisibility(0);
                        }
                        object4 = StringCompanionObject.INSTANCE;
                        object4 = activePoints.getAmount();
                        if (object4 != null) {
                            f6 = ((Float)object4).floatValue();
                        } else {
                            n4 = 0;
                            f6 = 0.0f;
                            object4 = null;
                        }
                        object4 = qz2_0.x(Float.valueOf(f6));
                        object5 = new Object[n7];
                        object5[0] = object4;
                        zn0_1.b((Object[])object5, n7, (String)objectArray3, (String)charSequence, textView2);
                        ai0_2.B((View)textView2);
                        object.setVisibility(0);
                        f6 = 1.1E-44f;
                        textView.setVisibility(8);
                        n4 = R$string.expired_on;
                        object4 = hv3_0.K(n4);
                        object5 = k7.k(activePoints.getExpiryDate());
                        int n17 = 2;
                        float f7 = 2.8E-45f;
                        objectArray3 = new Object[n17];
                        objectArray3[0] = object4;
                        objectArray3[n7] = object5;
                        zn0_1.b(objectArray3, n17, string2, (String)charSequence, (TextView)object);
                        object = activePoints.isImageIcon();
                        object4 = Boolean.TRUE;
                        int n18 = Intrinsics.areEqual(object, object4);
                        if (n18 != 0) {
                            n18 = 8;
                            textView3.setVisibility(n18);
                            imageView.setVisibility(0);
                            object = new da$a();
                            ((da$a)object).k = n7;
                            ((da$a)object).b = n4 = R$drawable.component_placeholder;
                            ((da$a)object).n = object4 = activePoints.getImageUrl();
                            ((da$a)object).u = imageView;
                            ((da$a)object).a();
                        } else {
                            textView3.setVisibility(0);
                            n18 = 4;
                            imageView.setVisibility(n18);
                            object = activePoints.getIconTextDisplay();
                            textView3.setText((CharSequence)object);
                        }
                    } else {
                        object4 = activePoints.getTransactionReason();
                        n4 = (int)(Intrinsics.areEqual(object4, object3 = "REFUND") ? 1 : 0);
                        if (n4 != 0) {
                            int n19;
                            float f8;
                            object4 = StringCompanionObject.INSTANCE;
                            object4 = activePoints.getAmount();
                            if (object4 != null) {
                                f8 = ((Float)object4).floatValue();
                            } else {
                                n4 = 0;
                                f8 = 0.0f;
                                object4 = null;
                            }
                            object4 = qz2_0.x(Float.valueOf(f8));
                            object3 = new Object[n7];
                            n10 = 0;
                            objectArray3 = null;
                            object3[0] = object4;
                            zn0_1.b(object3, n7, (String)object6, (String)charSequence, textView2);
                            ai0_2.B((View)textView2);
                            object4 = activePoints.isExpired();
                            object3 = Boolean.TRUE;
                            n4 = (int)(Intrinsics.areEqual(object4, object3) ? 1 : 0);
                            if (n4 != 0) {
                                object4 = cp_1.Companion;
                                n4 = (int)(km_1.b((cp$a)object4) ? 1 : 0);
                                if (n4 == 0) {
                                    objectArray.setVisibility(0);
                                }
                                object.setVisibility(0);
                                n4 = 8;
                                f8 = 1.1E-44f;
                                textView.setVisibility(n4);
                                n8 = R$string.expired_on;
                                object5 = hv3_0.K(n8);
                                object6 = k7.k(activePoints.getExpiryDate());
                                int n20 = 2;
                                objectArray = new Object[n20];
                                objectArray[0] = object5;
                                objectArray[n7] = object6;
                                zn0_1.b(objectArray, n20, string2, (String)charSequence, (TextView)object);
                            } else {
                                f8 = 1.1E-44f;
                                int n21 = 2;
                                objectArray.setVisibility(8);
                                object.setVisibility(0);
                                textView.setVisibility(0);
                                n4 = R$string.refunded;
                                object4 = hv3_0.K(n4);
                                object6 = k7.k(activePoints.getActivationDate());
                                objectArray = new Object[n21];
                                objectArray[0] = object4;
                                objectArray[n7] = object6;
                                zn0_1.b(objectArray, n21, string2, (String)charSequence, (TextView)object);
                                n19 = R$string.starts_expiring;
                                object = hv3_0.K(n19);
                                object4 = k7.k(activePoints.getExpiryDate());
                                object6 = new Object[n21];
                                object6[0] = object;
                                object6[n7] = object4;
                                zn0_1.b(object6, n21, (String)object5, (String)charSequence, textView);
                            }
                            object = activePoints.isImageIcon();
                            n19 = (int)(Intrinsics.areEqual(object, object3) ? 1 : 0);
                            if (n19 != 0) {
                                n19 = 8;
                                textView3.setVisibility(n19);
                                imageView.setVisibility(0);
                                object = new da$a();
                                ((da$a)object).k = n7;
                                ((da$a)object).b = n4 = R$drawable.component_placeholder;
                                ((da$a)object).n = object4 = activePoints.getImageUrl();
                                ((da$a)object).u = imageView;
                                ((da$a)object).a();
                            } else {
                                textView3.setVisibility(0);
                                n19 = 4;
                                imageView.setVisibility(n19);
                                object = activePoints.getIconTextDisplay();
                                textView3.setText((CharSequence)object);
                            }
                        } else {
                            object4 = activePoints.getTransactionReason();
                            n4 = (int)(Intrinsics.areEqual(object4, object3 = "SPEND") ? 1 : 0);
                            if (n4 != 0) {
                                n4 = 8;
                                float f11 = 1.1E-44f;
                                objectArray.setVisibility(n4);
                                object4 = StringCompanionObject.INSTANCE;
                                object4 = activePoints.getAmount();
                                if (object4 != null) {
                                    f11 = ((Float)object4).floatValue();
                                } else {
                                    n4 = 0;
                                    f11 = 0.0f;
                                    object4 = null;
                                }
                                object4 = qz2_0.x(Float.valueOf(f11));
                                object3 = new Object[n7];
                                n8 = 0;
                                object5 = null;
                                object3[0] = object4;
                                zn0_1.b(object3, n7, (String)objectArray3, (String)charSequence, textView2);
                                ai0_2.B((View)textView2);
                                object.setVisibility(0);
                                f11 = 1.1E-44f;
                                textView.setVisibility(8);
                                n4 = R$string.debited;
                                object4 = hv3_0.K(n4);
                                object3 = k7.k(activePoints.getTransactionDate());
                                int n22 = 2;
                                float f12 = 2.8E-45f;
                                objectArray3 = new Object[n22];
                                objectArray3[0] = object4;
                                objectArray3[n7] = object3;
                                zn0_1.b(objectArray3, n22, string2, (String)charSequence, (TextView)object);
                                object = activePoints.isImageIcon();
                                object4 = Boolean.TRUE;
                                int n24 = Intrinsics.areEqual(object, object4);
                                if (n24 != 0) {
                                    n24 = 8;
                                    textView3.setVisibility(n24);
                                    imageView.setVisibility(0);
                                    object = new da$a();
                                    ((da$a)object).k = n7;
                                    ((da$a)object).b = n4 = R$drawable.component_placeholder;
                                    ((da$a)object).n = object4 = activePoints.getImageUrl();
                                    ((da$a)object).u = imageView;
                                    ((da$a)object).a();
                                } else {
                                    textView3.setVisibility(0);
                                    n24 = 4;
                                    imageView.setVisibility(n24);
                                    object = activePoints.getIconTextDisplay();
                                    textView3.setText((CharSequence)object);
                                }
                            } else {
                                int n25;
                                boolean bl3;
                                float f14;
                                object4 = activePoints.getAmount();
                                object3 = "CREDIT";
                                object5 = "DEBIT";
                                if (object4 != null) {
                                    object4 = activePoints.getTransactionType();
                                    object4 = object4 != null && (n4 = (int)(((String)object4).equalsIgnoreCase((String)object5) ? 1 : 0)) == n7 ? "-" : ((object4 = activePoints.getTransactionType()) != null && (n4 = (int)(((String)object4).equalsIgnoreCase((String)object3) ? 1 : 0)) == n7 ? "+" : "");
                                    object6 = StringCompanionObject.INSTANCE;
                                    object4 = ((String)object4).concat(" %s");
                                    object6 = activePoints.getAmount();
                                    if (object6 != null) {
                                        f14 = object6.floatValue();
                                    } else {
                                        bl3 = false;
                                        f14 = 0.0f;
                                        object6 = null;
                                    }
                                    object6 = qz2_0.x(Float.valueOf(f14));
                                    objectArray3 = new Object[n7];
                                    string2 = null;
                                    objectArray3[0] = object6;
                                    zn0_1.b(objectArray3, n7, (String)object4, (String)charSequence, textView2);
                                    ai0_2.B((View)textView2);
                                } else {
                                    ai0_2.i((View)textView2);
                                }
                                ai0_2.i((View)objectArray);
                                ai0_2.i((View)object);
                                ai0_2.i((View)textView);
                                object4 = activePoints.getTransactionType();
                                if (object4 != null && (n4 = (int)(((String)object4).equalsIgnoreCase((String)object5) ? 1 : 0)) == n7) {
                                    object4 = activePoints.getTransactionReason();
                                    if (object4 != null && (n4 = (int)(((String)object4).equalsIgnoreCase((String)(object5 = "WALLET_TO_BANK_TRANSFER")) ? 1 : 0)) == n7) {
                                        n4 = R$string.transferred_on;
                                        object5 = k7.k(activePoints.getTransactionDate());
                                        object6 = new Object[n7];
                                        n10 = 0;
                                        objectArray3 = null;
                                        object6[0] = object5;
                                        object4 = hv3_0.L(n4, object6);
                                        object.setText((CharSequence)object4);
                                        ai0_2.B((View)object);
                                    } else {
                                        n10 = 0;
                                        objectArray3 = null;
                                        n4 = R$string.debited_on;
                                        object5 = k7.k(activePoints.getTransactionDate());
                                        object6 = new Object[n7];
                                        object6[0] = object5;
                                        object4 = hv3_0.L(n4, object6);
                                        object.setText((CharSequence)object4);
                                        ai0_2.B((View)object);
                                    }
                                }
                                if ((object4 = activePoints.getTransactionType()) != null && (n4 = (int)(((String)object4).equalsIgnoreCase((String)object3) ? 1 : 0)) == n7) {
                                    n4 = R$string.credited_on;
                                    object3 = k7.k(activePoints.getTransactionDate());
                                    object5 = new Object[n7];
                                    bl3 = false;
                                    f14 = 0.0f;
                                    object6 = null;
                                    object5[0] = object3;
                                    object4 = hv3_0.L(n4, (Object[])object5);
                                    object.setText((CharSequence)object4);
                                    ai0_2.B((View)object);
                                }
                                ai0_2.i((View)textView3);
                                object = activePoints.getImageUrl();
                                if (object != null && (n25 = ((String)object).length()) != 0) {
                                    object = new da$a();
                                    ((da$a)object).k = n7;
                                    ((da$a)object).b = n4 = R$drawable.component_placeholder;
                                    ((da$a)object).n = object4 = activePoints.getImageUrl();
                                    ((da$a)object).u = imageView;
                                    ((da$a)object).a();
                                    ai0_2.B((View)imageView);
                                } else {
                                    n25 = R$drawable.ic_cart;
                                    object = hv3_0.r(n25);
                                    imageView.setImageDrawable((Drawable)object);
                                    ai0_2.B((View)imageView);
                                }
                            }
                        }
                    }
                }
            } else {
                object.getClass();
            }
        } else {
            object2 = this;
            n4 = recyclerView$B instanceof p;
            if (n4 != 0) {
                object = (p)recyclerView$B;
                n4 = R$string.non_transferable;
                String string3 = hv3_0.K(n4);
                Object var21_23 = null;
                n7 = 0;
                ((p)object).w(string3, false, null);
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        int n4 = 2;
        String string2 = "inflate(...)";
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.row_ac_t_nt;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            n4 = 0;
            object = null;
            recyclerView$B = new p((View)viewGroup, null);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.row_ac_nt;
            viewGroup = object.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = this.d;
            recyclerView$B = new X5((View)viewGroup, (ja2_1)object);
        }
        return recyclerView$B;
    }
}

