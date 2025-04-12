/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnTouchListener
 */
package in.juspay.hypersdk.core;

import android.view.MotionEvent;
import android.view.View;
import in.juspay.hypersdk.core.InflateView;

class InflateView$4
implements View.OnTouchListener {
    final /* synthetic */ InflateView this$0;
    final /* synthetic */ String val$jsFunc;

    public InflateView$4(InflateView inflateView, String string2) {
        this.this$0 = inflateView;
        this.val$jsFunc = string2;
    }

    public boolean onTouch(View object, MotionEvent object2) {
        Object object3;
        int n3;
        block6: {
            block2: {
                block1: {
                    float f5;
                    float f6;
                    float f7;
                    Object object4;
                    block7: {
                        block4: {
                            block5: {
                                block3: {
                                    float f8;
                                    object4 = object2.getAction();
                                    n3 = 1;
                                    if (object4 == 0) break block1;
                                    if (object4 != n3) break block2;
                                    object = this.this$0;
                                    f7 = object2.getX();
                                    InflateView.access$202((InflateView)object, f7);
                                    object = this.this$0;
                                    f6 = object2.getY();
                                    InflateView.access$302((InflateView)object, f6);
                                    object = this.this$0;
                                    f5 = InflateView.access$200((InflateView)object);
                                    f6 = InflateView.access$000(this.this$0);
                                    f5 -= f6;
                                    f6 = InflateView.access$300(this.this$0);
                                    object3 = this.this$0;
                                    f7 = InflateView.access$100((InflateView)object3);
                                    double d2 = f6 - f7;
                                    double d5 = f5;
                                    d5 = Math.toDegrees(Math.atan2(d2, d5));
                                    f5 = (float)d5;
                                    f6 = 0.0f;
                                    object2 = null;
                                    float f11 = f5 - 0.0f;
                                    Object object5 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                                    if (object5 < 0) {
                                        object5 = 1135869952;
                                        f6 = 360.0f;
                                        f5 += f6;
                                    }
                                    f6 = 45.0f;
                                    f7 = 100.0f;
                                    object5 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
                                    if (object5 >= 0 && (object5 = (f8 = f5 - (f6 = 135.0f)) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) <= 0) break block3;
                                    f6 = 225.0f;
                                    float f12 = f5 - f6;
                                    object5 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
                                    if (object5 < 0) break block4;
                                    object5 = 1134395392;
                                    f6 = 315.0f;
                                    float f14 = f5 - f6;
                                    object4 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                                    if (object4 > 0) break block4;
                                }
                                object = this.this$0;
                                f5 = InflateView.access$300((InflateView)object);
                                object2 = this.this$0;
                                f6 = InflateView.access$100((InflateView)object2);
                                float f15 = (f5 -= f6) - f7;
                                object4 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                                if (object4 <= 0) break block5;
                                object = "2";
                                break block6;
                            }
                            object = this.this$0;
                            f5 = InflateView.access$100((InflateView)object);
                            object2 = this.this$0;
                            f6 = InflateView.access$300((InflateView)object2);
                            float f16 = (f5 -= f6) - f7;
                            object4 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                            if (object4 <= 0) break block2;
                            object = "-2";
                            break block6;
                        }
                        object = this.this$0;
                        f5 = InflateView.access$200((InflateView)object);
                        object2 = this.this$0;
                        f6 = InflateView.access$000((InflateView)object2);
                        float f17 = (f5 -= f6) - f7;
                        object4 = f17 == 0.0f ? 0 : (f17 > 0.0f ? 1 : -1);
                        if (object4 <= 0) break block7;
                        object = "1";
                        break block6;
                    }
                    object = this.this$0;
                    f5 = InflateView.access$000((InflateView)object);
                    object2 = this.this$0;
                    f6 = InflateView.access$200((InflateView)object2);
                    float f18 = (f5 -= f6) - f7;
                    object4 = f18 == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1);
                    if (object4 <= 0) break block2;
                    object = "-1";
                    break block6;
                }
                object = this.this$0;
                float f19 = object2.getX();
                InflateView.access$002((InflateView)object, f19);
                object = this.this$0;
                float f20 = object2.getY();
                InflateView.access$102((InflateView)object, f20);
            }
            object = "0";
        }
        object2 = new StringBuilder("window.callUICallback('");
        object3 = this.val$jsFunc;
        object = ko_0.a((StringBuilder)object2, (String)object3, "','", (String)object, "');");
        this.this$0.dynamicUI.addJsToWebView((String)object);
        return n3 != 0;
    }
}

