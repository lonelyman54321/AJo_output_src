/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  org.json.JSONArray
 *  org.json.JSONException
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.mystique;

import android.view.View;
import in.juspay.hypersdk.core.DuiCallback;
import in.juspay.hypersdk.mystique.AnimationHolder$CallbackHolder;
import in.juspay.hypersdk.mystique.AnimationHolder$InlineAnimation;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AnimationHolder {
    private static final String NAME = "name";
    private final WeakHashMap animatorHashMap;
    private final WeakHashMap callbackHashMap;
    private final float density;
    private final DuiCallback duiCallback;

    public AnimationHolder(DuiCallback weakHashMap, float f5) {
        this.density = f5;
        this.duiCallback = weakHashMap;
        this.animatorHashMap = weakHashMap = new WeakHashMap();
        this.callbackHashMap = weakHashMap = new WeakHashMap();
    }

    public static /* synthetic */ String access$000(AnimationHolder animationHolder, JSONObject jSONObject, String string2, String string3) {
        return animationHolder.getString(jSONObject, string2, string3);
    }

    public static /* synthetic */ ArrayList access$100(AnimationHolder animationHolder, JSONObject jSONObject) {
        return animationHolder.getJSONKeys(jSONObject);
    }

    public static /* synthetic */ DuiCallback access$200(AnimationHolder animationHolder) {
        return animationHolder.duiCallback;
    }

    public static /* synthetic */ WeakHashMap access$300(AnimationHolder animationHolder) {
        return animationHolder.callbackHashMap;
    }

    public static /* synthetic */ float access$400(AnimationHolder animationHolder, JSONObject jSONObject, String string2, float f5, float f6) {
        return animationHolder.getFloat(jSONObject, string2, f5, f6);
    }

    public static /* synthetic */ boolean access$500(AnimationHolder animationHolder, JSONObject jSONObject, String[] stringArray) {
        return animationHolder.hasOneKeyAtleast(jSONObject, stringArray);
    }

    public static /* synthetic */ float access$600(AnimationHolder animationHolder) {
        return animationHolder.density;
    }

    private void assertView(Object object) {
        boolean bl2 = object instanceof View;
        if (bl2) {
            return;
        }
        object = new Error("Instance object is not a view");
        throw object;
    }

    private float getFloat(JSONObject jSONObject, String string2, float f5, float f6) {
        double d2;
        double d5 = f6;
        try {
            d2 = jSONObject.getDouble(string2);
        }
        catch (JSONException jSONException) {
            return f5;
        }
        return (float)(d5 * d2);
    }

    private ArrayList getJSONKeys(JSONObject object) {
        boolean bl2;
        object = object.keys();
        ArrayList<String> arrayList = new ArrayList<String>();
        while (bl2 = object.hasNext()) {
            String string2 = (String)object.next();
            arrayList.add(string2);
        }
        return arrayList;
    }

    private JSONObject getJSONObject(JSONArray jSONArray, int n3) {
        try {
            return jSONArray.getJSONObject(n3);
        }
        catch (JSONException jSONException) {
            return null;
        }
    }

    private String getString(JSONObject jSONObject, String string2, String string3) {
        try {
            return jSONObject.getString(string2);
        }
        catch (JSONException jSONException) {
            return string3;
        }
    }

    private boolean hasOneKeyAtleast(JSONObject jSONObject, String ... stringArray) {
        for (String string2 : stringArray) {
            boolean bl2 = jSONObject.has(string2);
            if (!bl2) continue;
            return true;
        }
        return false;
    }

    private void setupAnimation(View object, JSONArray object2, Boolean object3) {
        boolean bl2;
        int n3;
        AbstractMap abstractMap;
        HashMap hashMap = (HashMap)this.animatorHashMap.get(object);
        if (hashMap == null) {
            hashMap = new HashMap();
            abstractMap = this.animatorHashMap;
            ((WeakHashMap)abstractMap).put((View)object, hashMap);
        }
        abstractMap = new HashMap();
        for (int i3 = 0; i3 < (n3 = object2.length()); ++i3) {
            Object object4 = this.getJSONObject((JSONArray)object2, i3);
            if (object4 == null) continue;
            Object object5 = "";
            String string2 = this.getString((JSONObject)object4, NAME, (String)object5);
            boolean bl3 = hashMap.containsKey(string2);
            if (bl3) {
                object5 = (AnimationHolder$InlineAnimation)hashMap.get(string2);
                if (object5 != null) {
                    ((AnimationHolder$InlineAnimation)object5).update((JSONObject)object4, (Boolean)object3);
                } else {
                    this.startNewAnimation((View)object, (JSONObject)object4, hashMap, string2);
                }
            } else {
                this.startNewAnimation((View)object, (JSONObject)object4, hashMap, string2);
            }
            object4 = Boolean.TRUE;
            ((HashMap)abstractMap).put(string2, object4);
        }
        object2 = hashMap.keySet();
        object = new ArrayList(object2);
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            object2 = (String)object.next();
            boolean bl4 = ((HashMap)abstractMap).containsKey(object2);
            if (bl4) continue;
            object3 = (AnimationHolder$InlineAnimation)hashMap.get(object2);
            if (object3 != null) {
                ((AnimationHolder$InlineAnimation)object3).remove();
            }
            hashMap.remove(object2);
        }
    }

    private void startNewAnimation(View view, JSONObject jSONObject, HashMap hashMap, String string2) {
        AnimationHolder$InlineAnimation animationHolder$InlineAnimation = new AnimationHolder$InlineAnimation(this, jSONObject, view);
        animationHolder$InlineAnimation.start();
        hashMap.put(string2, animationHolder$InlineAnimation);
    }

    private Boolean toResetAnimation(JSONObject jSONObject) {
        String string2 = "resetAnimation";
        boolean bl2 = jSONObject.has(string2);
        if (bl2) {
            boolean bl3;
            try {
                bl3 = jSONObject.getBoolean(string2);
            }
            catch (JSONException jSONException) {
                return Boolean.FALSE;
            }
            return bl3;
        }
        return Boolean.FALSE;
    }

    private void updateViewCallbacks(View view, JSONObject jSONObject) {
        AnimationHolder$CallbackHolder animationHolder$CallbackHolder = (AnimationHolder$CallbackHolder)this.callbackHashMap.get(view);
        if (animationHolder$CallbackHolder == null) {
            animationHolder$CallbackHolder = new AnimationHolder$CallbackHolder(this);
        }
        animationHolder$CallbackHolder.updateCallbacks(jSONObject);
        this.callbackHashMap.put(view, animationHolder$CallbackHolder);
    }

    public void applyAnimation(Object object, JSONArray jSONArray, JSONObject object2) {
        boolean bl2 = object instanceof View;
        if (bl2) {
            this.assertView(object);
            object = (View)object;
            this.updateViewCallbacks((View)object, (JSONObject)object2);
            object2 = this.toResetAnimation((JSONObject)object2);
            this.setupAnimation((View)object, jSONArray, (Boolean)object2);
        }
    }
}

