/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.graphics.drawable.Drawable
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.text.TextUtils
 *  android.util.TypedValue
 *  android.view.ContextThemeWrapper
 *  android.view.KeyEvent
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.view.Window
 *  android.widget.AbsListView$OnScrollListener
 *  android.widget.Button
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.ListAdapter
 *  android.widget.TextView
 */
package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.R$attr;
import androidx.appcompat.R$id;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.AlertController$3;
import androidx.appcompat.app.AlertController$5;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.appcompat.widget.LinearLayoutCompat$LayoutParams;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewCompat$d;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView$d;

public final class f
extends on
implements DialogInterface {
    public final AlertController a;

    public f(ContextThemeWrapper object, int n3) {
        n3 = f.b(n3, (Context)object);
        super((Context)object, n3);
        Context context = this.getContext();
        Window window = this.getWindow();
        super(context, this, window);
        this.a = object;
    }

    public static int b(int n3, Context context) {
        int n4 = n3 >>> 24 & 0xFF;
        int n7 = 1;
        if (n4 >= n7) {
            return n3;
        }
        TypedValue typedValue = new TypedValue();
        context = context.getTheme();
        n4 = R$attr.alertDialogTheme;
        context.resolveAttribute(n4, typedValue, n7 != 0);
        return typedValue.resourceId;
    }

    public final void onCreate(Bundle bundle) {
        float f5;
        CharSequence charSequence;
        Object object;
        int n3;
        int n4;
        int n7;
        Object object2;
        int n8;
        Object object3;
        int n10;
        super.onCreate(bundle);
        AlertController alertController = this.a;
        on on3 = alertController.b;
        int n14 = alertController.J;
        on3.setContentView(n14);
        int n15 = R$id.parentPanel;
        Window window = alertController.c;
        on3 = window.findViewById(n15);
        int n16 = R$id.topPanel;
        Object object4 = on3.findViewById(n16);
        int n17 = R$id.contentPanel;
        Object object5 = on3.findViewById(n17);
        int n18 = R$id.buttonPanel;
        Object object6 = on3.findViewById(n18);
        int n19 = R$id.customPanel;
        on3 = (ViewGroup)on3.findViewById(n19);
        Object object7 = alertController.h;
        Context context = alertController.a;
        int n20 = 0;
        if (object7 == null) {
            n19 = alertController.i;
            if (n19 != 0) {
                object7 = LayoutInflater.from((Context)context);
                n10 = alertController.i;
                object7 = object7.inflate(n10, (ViewGroup)on3, false);
            } else {
                n19 = 0;
                object7 = null;
            }
        }
        if (object7 != null) {
            n10 = 1;
        } else {
            n10 = 0;
            object3 = null;
        }
        if (n10 == 0 || (n8 = (int)(AlertController.a(object7) ? 1 : 0)) == 0) {
            n8 = 131072;
            window.setFlags(n8, n8);
        }
        n8 = -1;
        int n21 = 8;
        if (n10 != 0) {
            n10 = R$id.custom;
            object3 = (FrameLayout)window.findViewById(n10);
            object2 = new ViewGroup.LayoutParams(n8, n8);
            object3.addView(object7, object2);
            n7 = (int)(alertController.n ? 1 : 0);
            if (n7 != 0) {
                n7 = alertController.j;
                n19 = alertController.k;
                n4 = alertController.l;
                n3 = alertController.m;
                object3.setPadding(n7, n19, n4, n3);
            }
            if ((object2 = alertController.g) != null) {
                object2 = (LinearLayoutCompat$LayoutParams)on3.getLayoutParams();
                n4 = 0;
                object = null;
                object2.weight = 0.0f;
            }
        } else {
            on3.setVisibility(n21);
        }
        n7 = R$id.topPanel;
        object2 = on3.findViewById(n7);
        n4 = R$id.contentPanel;
        object = on3.findViewById(n4);
        n19 = R$id.buttonPanel;
        object7 = on3.findViewById(n19);
        object2 = AlertController.c((View)object2, object4);
        object = AlertController.c(object, object5);
        object4 = AlertController.c(object7, object6);
        n17 = R$id.scrollView;
        object5 = (NestedScrollView)window.findViewById(n17);
        alertController.A = object5;
        object5.setFocusable(false);
        alertController.A.setNestedScrollingEnabled(false);
        n17 = 16908299;
        object5 = (TextView)object.findViewById(n17);
        alertController.F = object5;
        if (object5 != null) {
            object6 = alertController.f;
            if (object6 != null) {
                object5.setText((CharSequence)object6);
            } else {
                object5.setVisibility(n21);
                object5 = alertController.A;
                object6 = alertController.F;
                object5.removeView(object6);
                object5 = alertController.g;
                if (object5 != null) {
                    object5 = (ViewGroup)alertController.A.getParent();
                    object6 = alertController.A;
                    n18 = object5.indexOfChild(object6);
                    object5.removeViewAt(n18);
                    object7 = alertController.g;
                    charSequence = new ViewGroup.LayoutParams(n8, n8);
                    object5.addView(object7, n18, (ViewGroup.LayoutParams)charSequence);
                } else {
                    object.setVisibility(n21);
                }
            }
        }
        object5 = (Button)object4.findViewById(16908313);
        alertController.o = object5;
        object6 = alertController.Q;
        object5.setOnClickListener((View.OnClickListener)object6);
        object5 = alertController.p;
        n17 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
        n19 = alertController.d;
        if (n17 != 0 && (object5 = alertController.r) == null) {
            alertController.o.setVisibility(n21);
            n17 = 0;
            object5 = null;
        } else {
            object5 = alertController.o;
            charSequence = alertController.p;
            object5.setText(charSequence);
            object5 = alertController.r;
            if (object5 != null) {
                object5.setBounds(0, 0, n19, n19);
                object5 = alertController.o;
                charSequence = alertController.r;
                n10 = 0;
                object3 = null;
                object5.setCompoundDrawables((Drawable)charSequence, null, null, null);
            }
            object5 = alertController.o;
            object5.setVisibility(0);
            n17 = 1;
        }
        charSequence = (Button)object4.findViewById(16908314);
        alertController.s = charSequence;
        charSequence.setOnClickListener((View.OnClickListener)object6);
        charSequence = alertController.t;
        n3 = (int)(TextUtils.isEmpty((CharSequence)charSequence) ? 1 : 0);
        if (n3 != 0 && (charSequence = alertController.v) == null) {
            charSequence = alertController.s;
            charSequence.setVisibility(n21);
        } else {
            charSequence = alertController.s;
            object3 = alertController.t;
            charSequence.setText((CharSequence)object3);
            charSequence = alertController.v;
            if (charSequence != null) {
                charSequence.setBounds(0, 0, n19, n19);
                charSequence = alertController.s;
                object3 = alertController.v;
                n8 = 0;
                charSequence.setCompoundDrawables((Drawable)object3, null, null, null);
            }
            charSequence = alertController.s;
            charSequence.setVisibility(0);
            n3 = 2;
            n17 |= n3;
        }
        n3 = 16908315;
        charSequence = (Button)object4.findViewById(n3);
        alertController.w = charSequence;
        charSequence.setOnClickListener((View.OnClickListener)object6);
        object6 = alertController.x;
        n18 = (int)(TextUtils.isEmpty((CharSequence)object6) ? 1 : 0);
        if (n18 != 0 && (object6 = alertController.z) == null) {
            object6 = alertController.w;
            object6.setVisibility(n21);
            n10 = 0;
            object3 = null;
        } else {
            object6 = alertController.w;
            charSequence = alertController.x;
            object6.setText(charSequence);
            object6 = alertController.z;
            if (object6 != null) {
                object6.setBounds(0, 0, n19, n19);
                object6 = alertController.w;
                object7 = alertController.z;
                n10 = 0;
                object3 = null;
                object6.setCompoundDrawables((Drawable)object7, null, null, null);
            } else {
                n10 = 0;
                object3 = null;
            }
            object6 = alertController.w;
            object6.setVisibility(0);
            n18 = 4;
            f5 = 5.6E-45f;
            n17 |= n18;
        }
        object6 = new TypedValue();
        object7 = context.getTheme();
        int n22 = R$attr.alertDialogCenterButtons;
        n3 = 1;
        object7.resolveAttribute(n22, (TypedValue)object6, n3 != 0);
        n18 = object6.data;
        if (n18 != 0) {
            n18 = 0x3F000000;
            f5 = 0.5f;
            if (n17 == n3) {
                object7 = alertController.o;
                context = (LinearLayout.LayoutParams)object7.getLayoutParams();
                context.gravity = n3;
                context.weight = f5;
                object7.setLayoutParams((ViewGroup.LayoutParams)context);
            } else {
                n19 = 2;
                if (n17 == n19) {
                    object7 = alertController.s;
                    context = (LinearLayout.LayoutParams)object7.getLayoutParams();
                    context.gravity = n3;
                    context.weight = f5;
                    object7.setLayoutParams((ViewGroup.LayoutParams)context);
                } else {
                    n19 = 4;
                    if (n17 == n19) {
                        object7 = alertController.w;
                        context = (LinearLayout.LayoutParams)object7.getLayoutParams();
                        context.gravity = n3;
                        context.weight = f5;
                        object7.setLayoutParams((ViewGroup.LayoutParams)context);
                    }
                }
            }
        }
        if (n17 == 0) {
            object4.setVisibility(n21);
        }
        object5 = alertController.G;
        if (object5 != null) {
            n18 = -2;
            f5 = 0.0f / 0.0f;
            n19 = -1;
            object5 = new ViewGroup.LayoutParams(n19, n18);
            object6 = alertController.G;
            object2.addView(object6, 0, (ViewGroup.LayoutParams)object5);
            n17 = R$id.title_template;
            object5 = window.findViewById(n17);
            object5.setVisibility(n21);
        } else {
            object5 = (ImageView)window.findViewById(16908294);
            alertController.D = object5;
            object5 = alertController.e;
            n17 = (int)(TextUtils.isEmpty((CharSequence)object5) ? 1 : 0);
            n18 = 1;
            f5 = Float.MIN_VALUE;
            if ((n17 ^= n18) != 0 && (n17 = (int)(alertController.O ? 1 : 0)) != 0) {
                n17 = R$id.alertTitle;
                object5 = (TextView)window.findViewById(n17);
                alertController.E = object5;
                object6 = alertController.e;
                object5.setText((CharSequence)object6);
                n17 = alertController.B;
                if (n17 != 0) {
                    object6 = alertController.D;
                    object6.setImageResource(n17);
                } else {
                    object5 = alertController.C;
                    if (object5 != null) {
                        object6 = alertController.D;
                        object6.setImageDrawable((Drawable)object5);
                    } else {
                        object5 = alertController.E;
                        object6 = alertController.D;
                        n18 = object6.getPaddingLeft();
                        object7 = alertController.D;
                        n19 = object7.getPaddingTop();
                        context = alertController.D;
                        n22 = context.getPaddingRight();
                        charSequence = alertController.D;
                        n3 = charSequence.getPaddingBottom();
                        object5.setPadding(n18, n19, n22, n3);
                        object5 = alertController.D;
                        object5.setVisibility(n21);
                    }
                }
            } else {
                n17 = R$id.title_template;
                window.findViewById(n17).setVisibility(n21);
                object5 = alertController.D;
                object5.setVisibility(n21);
                object2.setVisibility(n21);
            }
        }
        n15 = on3.getVisibility();
        if (n15 != n21) {
            n15 = 1;
        } else {
            n15 = 0;
            on3 = null;
        }
        if (object2 != null && (n17 = object2.getVisibility()) != n21) {
            n17 = 1;
        } else {
            n17 = 0;
            object5 = null;
        }
        n16 = object4.getVisibility();
        n21 = n16 != n21 ? 1 : 0;
        if (n21 == 0 && (object4 = object.findViewById(n16 = R$id.textSpacerNoButtons)) != null) {
            object4.setVisibility(0);
        }
        if (n17 != 0) {
            object4 = alertController.A;
            if (object4 != null) {
                n18 = 1;
                f5 = Float.MIN_VALUE;
                object4.setClipToPadding(n18 != 0);
            }
            if ((object4 = alertController.f) == null && (object4 = alertController.g) == null) {
                n7 = 0;
                object2 = null;
            } else {
                n16 = R$id.titleDividerNoCustom;
                object2 = object2.findViewById(n16);
            }
            if (object2 != null) {
                object2.setVisibility(0);
            }
        } else {
            n7 = R$id.textSpacerNoTitle;
            object2 = object.findViewById(n7);
            if (object2 != null) {
                object2.setVisibility(0);
            }
        }
        if ((n16 = (object2 = alertController.g) instanceof AlertController$RecycleListView) != 0) {
            ((AlertController$RecycleListView)((Object)object2)).setHasDecor(n17 != 0, n21 != 0);
        }
        if (n15 == 0) {
            object2 = alertController.g;
            if (object2 == null) {
                object2 = alertController.A;
            }
            if (object2 != null) {
                if (n21 != 0) {
                    n20 = 2;
                }
                n21 = n17 | n20;
                n15 = R$id.scrollIndicatorUp;
                on3 = window.findViewById(n15);
                n16 = R$id.scrollIndicatorDown;
                window = window.findViewById(n16);
                n16 = Build.VERSION.SDK_INT;
                n17 = 23;
                if (n16 >= n17) {
                    object6 = ViewCompat.a;
                    if (n16 >= n17) {
                        n16 = 3;
                        ViewCompat$d.b((View)object2, n21, n16);
                    }
                    if (on3 != null) {
                        object.removeView((View)on3);
                    }
                    if (window != null) {
                        object.removeView((View)window);
                    }
                } else {
                    if (on3 != null) {
                        n7 = 1;
                        n16 = n21 & 1;
                        if (n16 == 0) {
                            object.removeView((View)on3);
                            n15 = 0;
                            on3 = null;
                        }
                    }
                    if (window != null && (n7 = 2 & n21) == 0) {
                        object.removeView((View)window);
                        n3 = 0;
                        charSequence = null;
                    } else {
                        charSequence = window;
                    }
                    if (on3 != null || charSequence != null) {
                        object2 = alertController.f;
                        if (object2 != null) {
                            object2 = alertController.A;
                            object = new Hc((View)on3, (View)charSequence);
                            object2.setOnScrollChangeListener((NestedScrollView$d)object);
                            object2 = alertController.A;
                            object = new AlertController$3(alertController, (View)on3, (View)charSequence);
                            object2.post((Runnable)object);
                        } else {
                            object2 = alertController.g;
                            if (object2 != null) {
                                object = new Ic((View)on3, (View)charSequence);
                                object2.setOnScrollListener((AbsListView.OnScrollListener)object);
                                object2 = alertController.g;
                                object = new AlertController$5(alertController, (View)on3, (View)charSequence);
                                object2.post((Runnable)object);
                            } else {
                                if (on3 != null) {
                                    object.removeView((View)on3);
                                }
                                if (charSequence != null) {
                                    object.removeView((View)charSequence);
                                }
                            }
                        }
                    }
                }
            }
        }
        if ((object2 = alertController.g) != null && (object = alertController.H) != null) {
            object2.setAdapter((ListAdapter)object);
            n4 = alertController.I;
            n21 = -1;
            if (n4 > n21) {
                n21 = 1;
                object2.setItemChecked(n4, n21 != 0);
                object2.setSelection(n4);
            }
        }
    }

    public final boolean onKeyDown(int n3, KeyEvent keyEvent) {
        boolean bl2;
        NestedScrollView nestedScrollView = this.a.A;
        if (nestedScrollView != null && (bl2 = nestedScrollView.d(keyEvent))) {
            return true;
        }
        return super.onKeyDown(n3, keyEvent);
    }

    public final boolean onKeyUp(int n3, KeyEvent keyEvent) {
        boolean bl2;
        NestedScrollView nestedScrollView = this.a.A;
        if (nestedScrollView != null && (bl2 = nestedScrollView.d(keyEvent))) {
            return true;
        }
        return super.onKeyUp(n3, keyEvent);
    }

    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        AlertController alertController = this.a;
        alertController.e = charSequence;
        alertController = alertController.E;
        if (alertController != null) {
            alertController.setText(charSequence);
        }
    }
}

