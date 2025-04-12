/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageButton
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
package com.ril.ajio.closet.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.closet.activity.ClosetAddToBagActivity$a;
import com.ril.ajio.closet.activity.ClosetAddToBagActivity$b;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.services.data.Product.ProductOptionItem;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import com.ril.ajio.services.query.QueryProductDetails;
import com.ril.ajio.view.BaseSplitActivity;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;

public final class ClosetAddToBagActivity
extends BaseSplitActivity
implements View.OnClickListener,
c92 {
    public static final ClosetAddToBagActivity$a Companion;
    public ProductOptionItem A0;
    public int X = 1;
    public TextView Y;
    public AjioImageView Z;
    public AjioImageView k0;
    public ImageButton p0;
    public ImageButton q0;
    public RecyclerView r0;
    public AjioProgressView s0;
    public RelativeLayout t0;
    public ky1_0 u0;
    public fa2_1 v0;
    public ArrayList w0;
    public ArrayList x0;
    public LinearLayoutManager y0;
    public int z0;

    static {
        ClosetAddToBagActivity$a closetAddToBagActivity$a;
        Companion = closetAddToBagActivity$a = new Object();
    }

    public final void finish() {
        RelativeLayout relativeLayout = this.t0;
        if (relativeLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("dialogLayout");
            relativeLayout = null;
        }
        relativeLayout.setVisibility(8);
        super.finish();
    }

    public void onClick(View object) {
        int n3 = 0;
        Object object2 = null;
        int n4 = 1;
        Object object3 = "v";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        int n7 = object.getId();
        int n8 = R$id.cancel;
        if (n7 == n8) {
            this.finish();
        } else {
            n8 = R$id.addToBag;
            int n10 = -1;
            String string2 = "quantityTv";
            Object object4 = null;
            if (n7 == n8) {
                object = this.A0;
                if (object != null) {
                    object = new Intent();
                    object2 = new Bundle();
                    object3 = this.A0;
                    object2.putSerializable("slected_product", (Serializable)object3);
                    Object object5 = this.Y;
                    if (object5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        object4 = object5;
                    }
                    object5 = ((Object)object4.getText()).toString();
                    n4 = Integer.parseInt((String)object5);
                    object3 = "product_quantity";
                    object2.putInt((String)object3, n4);
                    object.putExtras(object2);
                    this.setResult(n10, (Intent)object);
                    this.finish();
                } else {
                    object = StringCompanionObject.INSTANCE;
                    n7 = R$string.acc_alert_message;
                    object = hv3_0.K(n7);
                    n8 = R$string.select_size_text;
                    object3 = hv3_0.K(n8);
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = object3;
                    object2 = "format(...)";
                    object = xh2_0.a(objectArray, n4, (String)object, (String)object2);
                    n3 = R$string.select_size_text;
                    mq0_2.a(n3, (String)object);
                }
            } else {
                n8 = R$id.increment_product_button;
                String string3 = "quantityIncrementTv";
                String string4 = "quantityDecrementTv";
                if (n7 == n8) {
                    this.X = n7 = this.X + n4;
                    object = this.Y;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n7 = 0;
                        object = null;
                    }
                    object3 = String.valueOf(this.X);
                    object.setText((CharSequence)object3);
                    n7 = this.X;
                    n8 = 9;
                    if (n7 < n8) {
                        object = this.k0;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            n7 = 0;
                            object = null;
                        }
                        n3 = R$drawable.prevlevel_filters_arrow;
                        object.setBackgroundResource(n3);
                        object = this.k0;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                        } else {
                            object4 = object;
                        }
                        object4.setClickable(n4 != 0);
                    } else {
                        object = this.Z;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n7 = 0;
                            object = null;
                        }
                        object.setClickable(false);
                        object = this.Z;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                            n7 = 0;
                            object = null;
                        }
                        n3 = R$drawable.quantity_disable_inc;
                        object.setBackgroundResource(n3);
                        object = this.Z;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string3);
                        } else {
                            object4 = object;
                        }
                        n7 = R$string.acc_quantity_increase_icon;
                        object = hv3_0.K(n7);
                        object4.setContentDescription((CharSequence)object);
                    }
                } else {
                    n8 = R$id.decrement_product_button;
                    if (n7 == n8) {
                        this.X = n7 = this.X + n10;
                        object = this.Y;
                        if (object == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n7 = 0;
                            object = null;
                        }
                        n8 = this.X;
                        object3 = String.valueOf(n8);
                        object.setText((CharSequence)object3);
                        n7 = this.X;
                        if (n7 > n4) {
                            object = this.Z;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n7 = 0;
                                object = null;
                            }
                            n3 = R$drawable.nxtlevel_filters_arrow;
                            object.setBackgroundResource(n3);
                            object = this.Z;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string3);
                                n7 = 0;
                                object = null;
                            }
                            object.setClickable(n4 != 0);
                            object = this.k0;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string4);
                            } else {
                                object4 = object;
                            }
                            n7 = R$string.acc_next_level_filters_arrow;
                            object = hv3_0.K(n7);
                            object4.setContentDescription((CharSequence)object);
                        } else {
                            object = this.k0;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string4);
                                n7 = 0;
                                object = null;
                            }
                            object.setClickable(false);
                            object = this.k0;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string4);
                                n7 = 0;
                                object = null;
                            }
                            n3 = R$drawable.quantity_disable_dec;
                            object.setBackgroundResource(n3);
                            object = this.k0;
                            if (object == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string4);
                            } else {
                                object4 = object;
                            }
                            n7 = R$string.acc_quantity_decrease_icon;
                            object = hv3_0.K(n7);
                            object4.setContentDescription((CharSequence)object);
                        }
                    } else {
                        n8 = R$id.size_increment;
                        String string5 = "recyclerViewSize";
                        if (n7 == n8) {
                            object = this.y0;
                            if (object != null && (object3 = this.w0) != null) {
                                n7 = object.findLastVisibleItemPosition();
                                if (n7 <= (n8 = (object3 = this.w0) != null ? ((ArrayList)object3).size() : -2)) {
                                    object = this.r0;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                                    } else {
                                        object4 = object;
                                    }
                                    object = this.y0;
                                    Intrinsics.checkNotNull(object);
                                    n7 = object.findLastVisibleItemPosition() + n4;
                                    ((RecyclerView)object4).smoothScrollToPosition(n7);
                                } else {
                                    object = this.r0;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                                        n7 = 0;
                                        object = null;
                                    }
                                    object3 = this.w0;
                                    Intrinsics.checkNotNull(object3);
                                    n8 = ((ArrayList)object3).size() - n4;
                                    object.smoothScrollToPosition(n8);
                                    object = this.p0;
                                    String string6 = "sizeIncrementTv";
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                                        n7 = 0;
                                        object = null;
                                    }
                                    n8 = R$drawable.quantity_disable_inc;
                                    object.setBackgroundResource(n8);
                                    object = this.p0;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                                        n7 = 0;
                                        object = null;
                                    }
                                    n8 = R$string.acc_quantity_increase_icon;
                                    object3 = hv3_0.K(n8);
                                    object.setContentDescription((CharSequence)object3);
                                    object = this.p0;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string6);
                                    } else {
                                        object4 = object;
                                    }
                                    object4.setClickable(false);
                                }
                            }
                        } else {
                            n8 = R$id.size_decrement;
                            if (n7 == n8 && (object = this.y0) != null) {
                                Intrinsics.checkNotNull(object);
                                n7 = object.findFirstVisibleItemPosition();
                                if (n7 >= n4) {
                                    object = this.r0;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                                    } else {
                                        object4 = object;
                                    }
                                    object = this.y0;
                                    Intrinsics.checkNotNull(object);
                                    n7 = object.findFirstVisibleItemPosition() - n4;
                                    ((RecyclerView)object4).smoothScrollToPosition(n7);
                                } else {
                                    object = this.r0;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                                        n7 = 0;
                                        object = null;
                                    }
                                    object.smoothScrollToPosition(0);
                                    object = this.q0;
                                    String string7 = "sizeDecrementTv";
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string7);
                                        n7 = 0;
                                        object = null;
                                    }
                                    n8 = R$drawable.quantity_disable_dec;
                                    object.setBackgroundResource(n8);
                                    object = this.q0;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string7);
                                        n7 = 0;
                                        object = null;
                                    }
                                    n8 = R$string.acc_quantity_decrease_icon;
                                    object3 = hv3_0.K(n8);
                                    object.setContentDescription((CharSequence)object3);
                                    object = this.q0;
                                    if (object == null) {
                                        Intrinsics.throwUninitializedPropertyAccessException(string7);
                                    } else {
                                        object4 = object;
                                    }
                                    object4.setClickable(false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        int n3 = R$layout.activity_closet_add_to_bag;
        this.setContentView(n3);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object2 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = this.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(this, (String)object);
        object = this.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object2, "store");
        Intrinsics.checkNotNullParameter(object3, "factory");
        object = li_2.a((Wd0)object, "defaultCreationExtras", (rd3_0)object2, (E$b)object3, (Wd0)object);
        object2 = ky1_0.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Object object4 = "<this>";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object2 = Reflection.getOrCreateKotlinClass((Class)object2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            Object object5;
            int n4;
            Object object6;
            Object object7;
            object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = ((String)object4).concat((String)object3);
            object = (ky1_0)object.a((yn1_2)object2, (String)object3);
            this.u0 = object;
            n3 = R$id.fragment_cart_list_progress_bar;
            object = (AjioProgressView)this.findViewById(n3);
            this.s0 = object;
            n3 = R$id.dialog_layout;
            object = (RelativeLayout)this.findViewById(n3);
            this.t0 = object;
            n3 = R$id.quantity;
            object = (TextView)this.findViewById(n3);
            this.Y = object;
            n3 = R$id.size_increment;
            object = (ImageButton)this.findViewById(n3);
            this.p0 = object;
            n3 = R$id.size_decrement;
            object = (ImageButton)this.findViewById(n3);
            this.q0 = object;
            n3 = R$id.increment_product_button;
            object = (AjioImageView)this.findViewById(n3);
            this.Z = object;
            n3 = R$id.decrement_product_button;
            object = (AjioImageView)this.findViewById(n3);
            this.k0 = object;
            n3 = R$id.size_container;
            object = (RecyclerView)this.findViewById(n3);
            this.r0 = object;
            object = this.t0;
            object2 = null;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dialogLayout");
                n3 = 0;
                object = null;
            }
            int n7 = 8;
            object.setVisibility(n7);
            object = this.s0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("progressView");
                n3 = 0;
                object = null;
            }
            n7 = 0;
            object3 = null;
            object.setVisibility(0);
            object = this.getIntent().getExtras();
            if (object != null) {
                object4 = "product_code";
                object = object.getString((String)object4);
            } else {
                n3 = 0;
                object = null;
            }
            object4 = "mClosetViewModel";
            if (object != null) {
                object7 = this.u0;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    object7 = null;
                }
                object7.getClass();
                Intrinsics.checkNotNullParameter(object, "code");
                object6 = new QueryProductDetails();
                ((QueryProductDetails)object6).setProductCode((String)object);
                object = ((ky1_0)object7).c.getProductSize((QueryProductDetails)object6);
                n4 = 1;
                object6 = new kn_2(object7, n4);
                object5 = new by1_1((kn_2)object6);
                object6 = new dy1_2((ky1_0)object7);
                ey1_2 ey1_22 = new ey1_2((dy1_2)object6);
                object = object.f((o60_0)object5, ey1_22);
                object7 = ((ky1_0)object7).G;
                ((t30_0)object7).b((yr0_2)object);
            } else {
                this.finish();
            }
            n3 = R$id.cancel;
            this.findViewById(n3).setOnClickListener((View.OnClickListener)this);
            n3 = R$id.addToBag;
            this.findViewById(n3).setOnClickListener((View.OnClickListener)this);
            object = this.p0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeIncrementTv");
                n3 = 0;
                object = null;
            }
            object.setOnClickListener((View.OnClickListener)this);
            object = this.q0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("sizeDecrementTv");
                n3 = 0;
                object = null;
            }
            object.setOnClickListener((View.OnClickListener)this);
            object = this.k0;
            object7 = "quantityDecrementTv";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                n3 = 0;
                object = null;
            }
            object.setOnClickListener((View.OnClickListener)this);
            object = this.Z;
            object6 = "quantityIncrementTv";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                n3 = 0;
                object = null;
            }
            object.setOnClickListener((View.OnClickListener)this);
            object = this.u0;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                n3 = 0;
                object = null;
            }
            object = object.l;
            n4 = 1;
            object4 = new zb_0(this, n4);
            object5 = new ClosetAddToBagActivity$b((zb_0)object4);
            object.e(this, (F62)object5);
            object = this.Y;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("quantityTv");
                n3 = 0;
                object = null;
            }
            object4 = "1";
            object.setText((CharSequence)object4);
            n3 = this.X;
            int n8 = 1;
            if (n3 <= n8) {
                object = this.k0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n3 = 0;
                    object = null;
                }
                n8 = R$drawable.quantity_disable_dec;
                object.setBackgroundResource(n8);
                object = this.k0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n3 = 0;
                    object = null;
                }
                n8 = R$string.acc_quantity_decrease_icon;
                object4 = hv3_0.K(n8);
                object.setContentDescription((CharSequence)object4);
                object = this.k0;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n3 = 0;
                    object = null;
                }
                object.setClickable(false);
            }
            if ((n3 = this.X) >= (n8 = 9)) {
                object = this.Z;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n3 = 0;
                    object = null;
                }
                n8 = R$drawable.quantity_disable_inc;
                object.setBackgroundResource(n8);
                object = this.Z;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                    n3 = 0;
                    object = null;
                }
                n8 = R$string.acc_quantity_increase_icon;
                object4 = hv3_0.K(n8);
                object.setContentDescription((CharSequence)object4);
                object = this.Z;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                } else {
                    object2 = object;
                }
                object2.setClickable(false);
            }
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void q2(String object, String object2, int n3, boolean n4, ProductOptionVariant productOptionVariant, boolean bl2) {
        int n7;
        Intrinsics.checkNotNullParameter(object2, "sizeName");
        object = this.w0;
        object2 = null;
        if (object != null) {
            object = (ProductOptionVariant)((ArrayList)object).get(n3);
        } else {
            n7 = 0;
            object = null;
        }
        Intrinsics.checkNotNull(object);
        Cloneable cloneable = this.w0;
        if (cloneable != null) {
            cloneable = (ProductOptionVariant)((ArrayList)cloneable).remove(n3);
        }
        n4 = 1;
        ((ProductOptionVariant)object).setSelected(n4 != 0);
        cloneable = this.w0;
        if (cloneable != null) {
            ((ArrayList)cloneable).add(n3, object);
        }
        if ((object = this.x0) != null) {
            object = (ProductOptionItem)((ArrayList)object).get(n3);
        } else {
            n7 = 0;
            object = null;
        }
        this.A0 = object;
        n7 = this.z0;
        n4 = -1;
        if (n7 > n4) {
            cloneable = this.w0;
            if (cloneable != null) {
                object2 = object = ((ArrayList)cloneable).get(n7);
                object2 = (ProductOptionVariant)object;
            }
            Intrinsics.checkNotNull(object2);
            object = this.w0;
            if (object != null) {
                n4 = this.z0;
                object = (ProductOptionVariant)((ArrayList)object).remove(n4);
            }
            n7 = 0;
            ((ProductOptionVariant)object2).setSelected(false);
            object = this.w0;
            if (object != null) {
                n4 = this.z0;
                ((ArrayList)object).add(n4, object2);
            }
        }
        if ((object = this.v0) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
        this.z0 = n3;
    }
}

