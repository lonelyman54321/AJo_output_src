/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Ux0
 */
public final class ux0_1
implements aa3_2 {
    public final void a(ba3_2 ba3_22) {
        Object object = ba3_22.c;
        String string2 = ba3_22.e;
        if (object != null) {
            object.setText((CharSequence)string2);
            ba3_22 = ba3_22.c;
            if (ba3_22 != null) {
                ba3_22.setVisibility(0);
                object = cp_1.Companion;
                int n3 = km_1.b((cp$a)object);
                if (n3 != 0) {
                    ba3_22.setImportantForAccessibility(1);
                    string2 = null;
                    ba3_22.performAccessibilityAction(64, null);
                    n3 = 4;
                    ba3_22.sendAccessibilityEvent(n3);
                }
                ba3_22.invalidate();
            }
        } else {
            ba3_22 = ba3_22.a;
            if (ba3_22 != null) {
                ba3_22.setText(string2);
                ba3_22.requestFocus();
            }
        }
    }
}

