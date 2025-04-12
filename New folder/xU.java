/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.widget.ScrollView
 *  android.widget.TextView
 */
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import com.chuckerteam.chucker.R$id;
import com.chuckerteam.chucker.R$layout;

public final class xU
implements BC3 {
    public final ScrollView a;
    public final Group b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final Group l;
    public final TextView m;
    public final TextView n;
    public final Group o;
    public final TextView p;
    public final TextView q;
    public final TextView r;

    public xU(ScrollView scrollView, Group group, TextView textView, TextView textView2, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, Group group2, TextView textView10, TextView textView11, Group group3, TextView textView12, TextView textView13, TextView textView14) {
        this.a = scrollView;
        this.b = group;
        this.c = textView;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.g = textView5;
        this.h = textView6;
        this.i = textView7;
        this.j = textView8;
        this.k = textView9;
        this.l = group2;
        this.m = textView10;
        this.n = textView11;
        this.o = group3;
        this.p = textView12;
        this.q = textView13;
        this.r = textView14;
    }

    public static xU bind(View view) {
        Object object = view;
        int n3 = R$id.barrierRequestSize;
        View view2 = (Barrier)view.findViewById(n3);
        if (view2 != null && (view2 = (Barrier)view.findViewById(n3 = R$id.barrierRequestTime)) != null && (view2 = (Barrier)view.findViewById(n3 = R$id.barrierResponseSize)) != null && (view2 = (Barrier)view.findViewById(n3 = R$id.barrierResponseTime)) != null && (view2 = (TextView)view.findViewById(n3 = R$id.cipherSuite)) != null) {
            n3 = R$id.cipherSuiteGroup;
            view2 = view.findViewById(n3);
            ConstraintHelper constraintHelper = view2;
            constraintHelper = (Group)view2;
            if (constraintHelper != null) {
                n3 = R$id.cipherSuiteValue;
                view2 = view.findViewById(n3);
                Barrier barrier = view2;
                barrier = (TextView)view2;
                if (barrier != null) {
                    n3 = R$id.duration;
                    view2 = view.findViewById(n3);
                    Barrier barrier2 = view2;
                    barrier2 = (TextView)view2;
                    if (barrier2 != null) {
                        n3 = R$id.method;
                        view2 = view.findViewById(n3);
                        Barrier barrier3 = view2;
                        barrier3 = (TextView)view2;
                        if (barrier3 != null && (view2 = (Guideline)view.findViewById(n3 = R$id.overviewGuideline)) != null) {
                            n3 = R$id.protocol;
                            View view3 = view2 = view.findViewById(n3);
                            view3 = (TextView)view2;
                            if (view3 != null) {
                                n3 = R$id.requestSize;
                                View view4 = view2 = view.findViewById(n3);
                                view4 = (TextView)view2;
                                if (view4 != null && (view2 = (TextView)view.findViewById(n3 = R$id.requestSizeLabel)) != null) {
                                    n3 = R$id.requestTime;
                                    View view5 = view2 = view.findViewById(n3);
                                    view5 = (TextView)view2;
                                    if (view5 != null && (view2 = (TextView)view.findViewById(n3 = R$id.requestTimeLabel)) != null) {
                                        n3 = R$id.response;
                                        View view6 = view2 = view.findViewById(n3);
                                        view6 = (TextView)view2;
                                        if (view6 != null) {
                                            n3 = R$id.responseSize;
                                            View view7 = view2 = view.findViewById(n3);
                                            view7 = (TextView)view2;
                                            if (view7 != null && (view2 = (TextView)view.findViewById(n3 = R$id.responseSizeLabel)) != null) {
                                                n3 = R$id.responseTime;
                                                View view8 = view2 = view.findViewById(n3);
                                                view8 = (TextView)view2;
                                                if (view8 != null && (view2 = (TextView)view.findViewById(n3 = R$id.responseTimeLabel)) != null && (view2 = (TextView)view.findViewById(n3 = R$id.ssl)) != null) {
                                                    n3 = R$id.sslGroup;
                                                    View view9 = view2 = view.findViewById(n3);
                                                    view9 = (Group)view2;
                                                    if (view9 != null) {
                                                        n3 = R$id.sslValue;
                                                        View view10 = view2 = view.findViewById(n3);
                                                        view10 = (TextView)view2;
                                                        if (view10 != null) {
                                                            n3 = R$id.status;
                                                            View view11 = view2 = view.findViewById(n3);
                                                            view11 = (TextView)view2;
                                                            if (view11 != null) {
                                                                n3 = R$id.tlsGroup;
                                                                View view12 = view2 = view.findViewById(n3);
                                                                view12 = (Group)view2;
                                                                if (view12 != null && (view2 = (TextView)view.findViewById(n3 = R$id.tlsVersion)) != null) {
                                                                    n3 = R$id.tlsVersionValue;
                                                                    View view13 = view2 = view.findViewById(n3);
                                                                    view13 = (TextView)view2;
                                                                    if (view13 != null) {
                                                                        n3 = R$id.totalSize;
                                                                        View view14 = view2 = view.findViewById(n3);
                                                                        view14 = (TextView)view2;
                                                                        if (view14 != null) {
                                                                            n3 = R$id.url;
                                                                            View view15 = view2 = view.findViewById(n3);
                                                                            view15 = (TextView)view2;
                                                                            if (view15 != null) {
                                                                                View view16 = view;
                                                                                view16 = (ScrollView)view;
                                                                                xU xU2 = new xU((ScrollView)view16, (Group)constraintHelper, (TextView)barrier, (TextView)barrier2, (TextView)barrier3, (TextView)view3, (TextView)view4, (TextView)view5, (TextView)view6, (TextView)view7, (TextView)view8, (Group)view9, (TextView)view10, (TextView)view11, (Group)view12, (TextView)view13, (TextView)view14, (TextView)view15);
                                                                                return xU2;
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        object = view.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static xU inflate(LayoutInflater layoutInflater) {
        int n3 = R$layout.chucker_fragment_transaction_overview;
        return xU.bind(layoutInflater.inflate(n3, null, false));
    }

    public final View getRoot() {
        return this.a;
    }
}

