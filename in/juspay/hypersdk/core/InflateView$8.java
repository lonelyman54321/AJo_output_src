/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.text.InputFilter
 *  android.text.TextWatcher
 *  android.widget.EditText
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.widget.EditText;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.InflateView;
import org.json.JSONObject;

class InflateView$8
implements TextWatcher {
    private static final int TOTAL_DIGITS = 21;
    private static final int TOTAL_SYMBOLS = 26;
    private final char DIVIDER;
    private final int DIVIDER_MODULO;
    private final int DIVIDER_POSITION;
    private boolean executeTextChange;
    private String previousText;
    final /* synthetic */ InflateView this$0;
    final /* synthetic */ EditText val$cardField;
    final /* synthetic */ String val$js;
    final /* synthetic */ JSONObject val$properties;

    public InflateView$8(InflateView inflateView, JSONObject jSONObject, String string2, EditText editText) {
        int n3;
        this.this$0 = inflateView;
        this.val$properties = jSONObject;
        this.val$js = string2;
        this.val$cardField = editText;
        this.DIVIDER_POSITION = n3 = jSONObject.getInt("separatorRepeat");
        int n4 = 1;
        this.DIVIDER_MODULO = n3 += n4;
        n3 = jSONObject.getString("separator").charAt(0);
        this.DIVIDER = (char)n3;
        this.executeTextChange = n4;
    }

    private String buildCorrectString(char[] cArray, int n3) {
        char c2;
        StringBuilder stringBuilder = new StringBuilder();
        for (char c3 = '\u0000'; c3 < (c2 = cArray.length); ++c3) {
            c2 = cArray[c3];
            if (c2 == '\u0000') continue;
            stringBuilder.append(c2);
            if (c3 <= '\u0000' || c3 >= (c2 = n3 + -1)) continue;
            c2 = c3 + 1;
            int n4 = this.DIVIDER_POSITION;
            if ((c2 %= n4) != '\u0000') continue;
            c2 = this.DIVIDER;
            stringBuilder.append(c2);
        }
        return stringBuilder.toString();
    }

    private char[] getDigitArray(Editable editable) {
        int n3;
        int n4 = 21;
        char[] cArray = new char[n4];
        int n7 = 0;
        for (int i3 = 0; i3 < (n3 = editable.length()) && n7 < n4; ++i3) {
            n3 = editable.charAt(i3);
            boolean bl2 = Character.isDigit((char)n3);
            if (!bl2) continue;
            cArray[n7] = n3;
            ++n7;
        }
        return cArray;
    }

    /*
     * Unable to fully structure code
     */
    private boolean isInputCorrect(Editable var1_1) {
        var2_2 = var1_1.length();
        var2_2 = var2_2 <= (var3_3 = 26) ? 1 : 0;
        block0: for (var3_3 = 0; var3_3 < (var4_4 = var1_1.length()); ++var3_3) {
            if (var3_3 > 0) {
                var4_4 = var3_3 + 1;
                var5_5 = this.DIVIDER_MODULO;
                if ((var4_4 %= var5_5) == 0) {
                    var4_4 = this.DIVIDER;
                    var5_5 = var1_1.charAt(var3_3);
                    var4_4 = var4_4 == var5_5 ? 1 : 0;
lbl11:
                    // 2 sources

                    while (true) {
                        var2_2 &= var4_4;
                        continue block0;
                        break;
                    }
                }
            }
            var4_4 = (int)Character.isDigit(var1_1.charAt(var3_3));
            ** continue;
        }
        return (boolean)var2_2;
    }

    public void afterTextChanged(Editable editable) {
        InputFilter[] inputFilterArray;
        int n3 = editable.length();
        if (n3 == 0) {
            return;
        }
        Object object = this.val$cardField;
        n3 = (int)(object.isFocused() ? 1 : 0);
        if (n3 != 0 && (n3 = (int)(((String)(object = this.previousText)).equals(inputFilterArray = editable.toString()) ? 1 : 0)) == 0 && (n3 = (int)(this.executeTextChange ? 1 : 0)) != 0) {
            object = this.previousText;
            n3 = ((String)object).length();
            int n4 = editable.length();
            int n7 = 0;
            int n8 = 1;
            if (n3 > n4) {
                n3 = 1;
            } else {
                n3 = 0;
                object = null;
            }
            inputFilterArray = editable.getFilters();
            EditText editText = new EditText[]{};
            editable.setFilters((InputFilter[])editText);
            editText = this.val$cardField;
            int n10 = editText.getSelectionStart();
            this.executeTextChange = false;
            int n14 = n10 + 1;
            int n15 = this.DIVIDER_MODULO;
            n15 = n14 % n15;
            if (n15 == 0 && n3 != 0) {
                n15 = n10 + -1;
                editable.delete(n15, n10);
            }
            if ((n15 = (int)(this.isInputCorrect(editable) ? 1 : 0)) == 0) {
                n15 = editable.length();
                Object object2 = this.getDigitArray(editable);
                int n16 = editable.length();
                object2 = this.buildCorrectString((char[])object2, n16);
                editable.replace(0, n15, (CharSequence)object2);
                n7 = editable.length();
                if (n7 > 0) {
                    n7 = this.DIVIDER;
                    n15 = editable.length() - n8;
                    if (n7 == (n15 = (int)editable.charAt(n15)) && n3 != 0) {
                        n7 = editable.length() - n8;
                        n15 = editable.length();
                        editable.delete(n7, n15);
                    }
                }
            }
            if (n10 != 0) {
                n7 = this.DIVIDER_MODULO;
                if ((n7 = n10 % n7) == 0 && (n7 = editable.length()) > n10 && n3 == 0) {
                    object = this.val$cardField;
                    object.setSelection(n14);
                }
            }
            this.executeTextChange = n8;
            editable.setFilters(inputFilterArray);
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        charSequence = charSequence.toString();
        this.previousText = charSequence;
    }

    public void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        Object object = this.previousText;
        CharSequence charSequence2 = charSequence.toString();
        n3 = (int)(((String)object).equals(charSequence2) ? 1 : 0);
        if (n3 == 0 && (n3 = (int)(this.executeTextChange ? 1 : 0)) != 0) {
            object = this.this$0.dynamicUI;
            charSequence2 = new StringBuilder("window.callUICallback('");
            String string2 = this.val$js;
            ((StringBuilder)charSequence2).append(string2);
            string2 = "', '";
            ((StringBuilder)charSequence2).append(string2);
            ((StringBuilder)charSequence2).append((Object)charSequence);
            ((StringBuilder)charSequence2).append("');");
            charSequence = ((StringBuilder)charSequence2).toString();
            ((DynamicUI)object).addJsToWebView((String)charSequence);
        }
    }
}

