/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.WebView
 */
import android.webkit.WebView;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.chromium.support_lib_boundary.DropDataContentProviderBoundaryInterface;
import org.chromium.support_lib_boundary.StaticsBoundaryInterface;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

public final class vs1
implements EF3 {
    public static final String[] a = new String[0];

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static final void b(Object object, int n3, ws1_0 ws1_02, u10 u102, b30_0 b30_02, int n4) {
        Throwable throwable2;
        v83_0 v83_02;
        Function1 function1;
        v83_0 v83_03;
        block18: {
            Object object2;
            int n7;
            Object object3 = object;
            int n8 = n3;
            ws1_0 ws1_03 = ws1_02;
            u10 u103 = u102;
            int n10 = n4;
            int n14 = -2079116560;
            Object object4 = b30_02.g(n14);
            int n15 = n4 & 6;
            if (n15 == 0) {
                n15 = (int)(((j30_0)object4).x(object) ? 1 : 0);
                n15 = n15 != 0 ? 4 : 2;
                n15 |= n10;
            } else {
                n15 = n4;
            }
            int n16 = n10 & 0x30;
            if (n16 == 0) {
                n16 = (int)(((j30_0)object4).c(n8) ? 1 : 0);
                n16 = n16 != 0 ? 32 : 16;
                n15 |= n16;
            }
            if ((n16 = n10 & 0x180) == 0) {
                n16 = (int)(((j30_0)object4).x(ws1_03) ? 1 : 0);
                n16 = n16 != 0 ? 256 : 128;
                n15 |= n16;
            }
            if ((n16 = n10 & 0xC00) == 0) {
                n16 = (int)(((j30_0)object4).x(u103) ? 1 : 0);
                n16 = n16 != 0 ? 2048 : 1024;
                n15 |= n16;
            }
            if ((n16 = n15 & 0x493) == (n7 = 1170) && (n16 = (int)(((j30_0)object4).h() ? 1 : 0)) != 0) {
                ((j30_0)object4).D();
            } else {
                int n17;
                Object object5;
                b30$a$a b30$a$a;
                Object object6;
                block17: {
                    n16 = (int)(((j30_0)object4).J(object3) ? 1 : 0);
                    n7 = (int)(((j30_0)object4).J(ws1_03) ? 1 : 0);
                    object6 = ((j30_0)object4).v();
                    b30$a$a = b30$a.a;
                    if ((n16 |= n7) != 0 || object6 == b30$a$a) {
                        object6 = new rs1_0(object3, ws1_03);
                        ((j30_0)object4).o(object6);
                    }
                    object6 = (rs1_0)object6;
                    object2 = ((rs1_0)object6).c;
                    object5 = ((rs1_0)object6).e;
                    ParcelableSnapshotMutableState parcelableSnapshotMutableState = ((rs1_0)object6).f;
                    ((e83_0)object2).e(n8);
                    object2 = Ds2.a;
                    cs2_0 cs2_02 = (cs2_0)((j30_0)object4).j((H30)object2);
                    v83_03 = v83$a.a();
                    function1 = v83_03 != null ? v83_03.f() : null;
                    v83_02 = v83$a.b(v83_03);
                    try {
                        Object object7;
                        object3 = object7 = parcelableSnapshotMutableState.getValue();
                        object3 = (cs2_0)object7;
                        if (cs2_02 == object3) break block17;
                    }
                    catch (Throwable throwable2) {
                        break block18;
                    }
                    parcelableSnapshotMutableState.setValue(cs2_02);
                    object3 = ((rs1_0)object6).d;
                    n17 = ((e83_0)object3).o();
                    if (n17 > 0) {
                        object3 = ((h83_0)object5).getValue();
                        if ((object3 = (Cs2$a)object3) != null) {
                            object3.release();
                        }
                        if (cs2_02 != null) {
                            object3 = cs2_02.a();
                        } else {
                            n17 = 0;
                            object3 = null;
                        }
                        ((h83_0)object5).setValue(object3);
                    }
                }
                object3 = Unit.a;
                v83$a.e(v83_03, v83_02, function1);
                n17 = (int)(((j30_0)object4).J(object6) ? 1 : 0);
                object5 = ((j30_0)object4).v();
                if (n17 != 0 || object5 == b30$a$a) {
                    object5 = new ts1_1((rs1_0)object6);
                    ((j30_0)object4).o(object5);
                }
                object5 = (Function1)object5;
                ly0_0.b(object6, (Function1)object5, (b30_0)object4);
                object3 = ((nw0_1)object2).c(object6);
                n15 = n15 >> 6 & 0x70;
                n16 = 8;
                L30.a((MB2)object3, u103, (b30_0)object4, n15 |= n16);
            }
            object3 = ((j30_0)object4).X();
            if (object3 != null) {
                object4 = object2;
                n8 = n3;
                ws1_03 = ws1_02;
                u103 = u102;
                n10 = n4;
                ((CF2)object3).d = object2 = new us1_1(object, n3, ws1_02, u102, n4);
            }
            return;
        }
        v83$a.e(v83_03, v83_02, function1);
        throw throwable2;
    }

    public String[] a() {
        return a;
    }

    public WebViewProviderBoundaryInterface createWebView(WebView object) {
        object = new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
        throw object;
    }

    public DropDataContentProviderBoundaryInterface getDropDataProvider() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
        throw unsupportedOperationException;
    }

    public StaticsBoundaryInterface getStatics() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("This should never happen, if this method was called it means we're trying to reach into WebView APK code on an incompatible device. This most likely means the current method is being called too early, or is being called on start-up rather than lazily");
        throw unsupportedOperationException;
    }
}

