/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.ViewGroup
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import in.juspay.hyper.core.ExecutorManager;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.InflateJSON;
import in.juspay.hypersdk.core.InflateView;
import in.juspay.hypersdk.core.MerchantViewType;
import in.juspay.hypersdk.core.Renderer$RenderTreeNode;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

public class Renderer {
    private final HashMap container;
    private final DynamicUI dynamicUI;
    private final HashMap prevView;
    ConcurrentHashMap viewCache;
    private int viewCacheCapacity;

    public Renderer(DynamicUI object, JSONObject jSONObject) {
        Object object2 = new ConcurrentHashMap();
        this.viewCache = object2;
        this.dynamicUI = object;
        this.container = object2;
        super();
        this.prevView = object2;
        object2 = "uiFeatures";
        jSONObject = jSONObject.getJSONObject((String)object2);
        object2 = "nbListItemCaching";
        jSONObject = jSONObject.getJSONObject((String)object2);
        object2 = "bgCacheCapacity";
        int n3 = jSONObject.getInt((String)object2);
        try {
            this.viewCacheCapacity = n3;
        }
        catch (Exception exception) {
            this.viewCacheCapacity = n3 = 4;
        }
        try {
            this.initCache();
        }
        catch (Exception exception) {
            object = ((DynamicUI)object).getLogger();
            String string2 = ((Object)exception).toString();
            object2 = "Error while initializing cache";
            object.e((String)object2, string2);
        }
    }

    public static /* synthetic */ void a(Renderer renderer, String[] stringArray) {
        renderer.lambda$initCache$0(stringArray);
    }

    private void addViewFromRenderTreeNodeQueue(Queue queue) {
        boolean bl2;
        while (!(bl2 = queue.isEmpty())) {
            Renderer$RenderTreeNode renderer$RenderTreeNode = (Renderer$RenderTreeNode)queue.poll();
            if (renderer$RenderTreeNode == null) continue;
            ViewGroup viewGroup = renderer$RenderTreeNode.parent;
            renderer$RenderTreeNode = renderer$RenderTreeNode.itself;
            viewGroup.addView((View)renderer$RenderTreeNode);
        }
    }

    public static /* synthetic */ void b(Renderer renderer, String string2) {
        renderer.lambda$replenishCache$1(string2);
    }

    private View createAllNodesAndReturnRoot(JSONObject jSONObject, Queue queue, boolean bl2) {
        Object object;
        Object object2;
        boolean bl3;
        Object object3 = jSONObject.getString("type");
        Object object4 = "props";
        Object object5 = jSONObject.getJSONObject((String)object4);
        int n3 = jSONObject.has((String)object4);
        if (n3 != 0) {
            this.setCurrentNodeDetails((String)object3, (JSONObject)object5);
        }
        object3 = this.getNewInstanceFromClassName((String)object3);
        object4 = object5.keys();
        while (bl3 = object4.hasNext()) {
            object2 = (String)object4.next();
            object = this.dynamicUI.getInflateView();
            ((InflateView)object).parseKeys((String)object2, (JSONObject)object5, object3, bl2);
        }
        object4 = object5.optString("viewType");
        boolean n4 = ((String)object4).isEmpty();
        if (!n4) {
            object5 = this.dynamicUI;
            object2 = object3;
            object2 = (ViewGroup)object3;
            object4 = MerchantViewType.valueOf((String)object4);
            if ((object4 = ((DynamicUI)object5).getMerchantView((ViewGroup)object2, (MerchantViewType)((Object)object4))) != null) {
                object5 = new Renderer$RenderTreeNode((ViewGroup)object2, (View)object4);
                queue.add(object5);
            }
        }
        if ((n3 = (jSONObject = jSONObject.getJSONArray((String)(object4 = "children"))).length()) != 0) {
            int n7;
            object4 = null;
            for (n3 = 0; n3 < (n7 = jSONObject.length()); ++n3) {
                object5 = jSONObject.getJSONObject(n3);
                object5 = this.createAllNodesAndReturnRoot((JSONObject)object5, queue, bl2);
                object = object3;
                object = (ViewGroup)object3;
                object2 = new Renderer$RenderTreeNode((ViewGroup)object, (View)object5);
                queue.add(object2);
            }
        }
        return (View)object3;
    }

    private View createNodesAndReturnRoot(JSONObject jSONObject, InflateView inflateView) {
        Object object;
        boolean bl2;
        Object object2 = jSONObject.getString("type");
        Object object3 = "props";
        JSONObject jSONObject2 = jSONObject.getJSONObject((String)object3);
        int n3 = jSONObject.has((String)object3);
        if (n3 != 0) {
            this.setCurrentNodeDetails((String)object2, jSONObject2);
        }
        object2 = this.getNewInstanceFromClassName((String)object2);
        object3 = jSONObject2.keys();
        while (bl2 = object3.hasNext()) {
            object = (String)object3.next();
            boolean bl3 = inflateView.getUseAppContext();
            inflateView.parseKeys((String)object, jSONObject2, object2, bl3);
        }
        object3 = "children";
        n3 = (jSONObject = jSONObject.getJSONArray((String)object3)).length();
        if (n3 != 0) {
            int n4;
            object3 = null;
            for (n3 = 0; n3 < (n4 = jSONObject.length()); ++n3) {
                jSONObject2 = jSONObject.getJSONObject(n3);
                jSONObject2 = this.createNodesAndReturnRoot(jSONObject2, inflateView);
                object = object2;
                object = (ViewGroup)object2;
                object.addView((View)jSONObject2);
            }
        }
        return (View)object2;
    }

    private Object getNewInstanceFromClassName(String constructor) {
        int n3 = 1;
        Context context = this.dynamicUI.getAppContext();
        Class[] classArray = this.getCachedViewFor((String)((Object)constructor));
        if (classArray != null) {
            return classArray;
        }
        constructor.getClass();
        int n4 = -1;
        int n7 = ((String)((Object)constructor)).hashCode();
        switch (n7) {
            default: {
                break;
            }
            case 1663696930: {
                String string2 = "android.widget.RadioButton";
                n7 = (int)(((String)((Object)constructor)).equals(string2) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 12;
                break;
            }
            case 1583615229: {
                String string3 = "android.widget.Button";
                n7 = (int)(((String)((Object)constructor)).equals(string3) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 11;
                break;
            }
            case 1540240509: {
                String string4 = "android.widget.TextView";
                n7 = (int)(((String)((Object)constructor)).equals(string4) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 10;
                break;
            }
            case 841510749: {
                String string5 = "android.widget.ScrollView";
                n7 = (int)(((String)((Object)constructor)).equals(string5) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 9;
                break;
            }
            case 670921973: {
                String string6 = "android.widget.ImageView";
                n7 = (int)(((String)((Object)constructor)).equals(string6) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 8;
                break;
            }
            case -50131582: {
                String string7 = "android.widget.ImageButton";
                n7 = (int)(((String)((Object)constructor)).equals(string7) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 7;
                break;
            }
            case -149114526: {
                String string8 = "android.widget.EditText";
                n7 = (int)(((String)((Object)constructor)).equals(string8) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 6;
                break;
            }
            case -214285650: {
                String string9 = "android.widget.CheckBox";
                n7 = (int)(((String)((Object)constructor)).equals(string9) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 5;
                break;
            }
            case -1238256809: {
                String string10 = "androidx.swiperefreshlayout.widget.SwipeRefreshLayout";
                n7 = (int)(((String)((Object)constructor)).equals(string10) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 4;
                break;
            }
            case -1430722502: {
                String string11 = "android.widget.LinearLayout";
                n7 = (int)(((String)((Object)constructor)).equals(string11) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 3;
                break;
            }
            case -1929723370: {
                String string12 = "android.view.TextureView";
                n7 = (int)(((String)((Object)constructor)).equals(string12) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 2;
                break;
            }
            case -1973910559: {
                String string13 = "android.widget.RelativeLayout";
                n7 = (int)(((String)((Object)constructor)).equals(string13) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 1;
                break;
            }
            case -2096886772: {
                String string14 = "android.widget.FrameLayout";
                n7 = (int)(((String)((Object)constructor)).equals(string14) ? 1 : 0);
                if (n7 == 0) break;
                n4 = 0;
                classArray = null;
            }
        }
        switch (n4) {
            default: {
                constructor = this.getInflateView().getClassName((String)((Object)constructor));
                classArray = new Class[n3];
                classArray[0] = Context.class;
                constructor = ((Class)((Object)constructor)).getConstructor(classArray);
                Object[] objectArray = new Object[n3];
                objectArray[0] = context;
                return constructor.newInstance(objectArray);
            }
            case 12: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 11: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 10: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 9: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 8: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 7: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 6: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 5: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 4: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 3: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 2: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 1: {
                constructor = new Constructor(context);
                return constructor;
            }
            case 0: 
        }
        constructor = new Constructor(context);
        return constructor;
    }

    private void initCache() {
        String[] stringArray = new String[]{"android.widget.RelativeLayout", "android.widget.LinearLayout", "android.widget.ImageView", "android.widget.ScrollView", "android.widget.TextView", "android.widget.EditText", "android.widget.FrameLayout"};
        rj2_2 rj2_22 = new rj2_2(this, stringArray);
        ExecutorManager.runOnBackgroundThread(rj2_22);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$initCache$0(String[] stringArray) {
        int n3 = 1;
        List<View> list = new List<View>();
        list = Collections.synchronizedList(list);
        int n4 = stringArray.length;
        int n7 = 0;
        while (true) {
            block6: {
                Exception exception2;
                View view;
                Object object;
                ArrayList arrayList;
                block5: {
                    if (n7 >= n4) {
                        return;
                    }
                    arrayList = stringArray[n7];
                    object = null;
                    try {
                        int n8;
                        for (int i3 = 0; i3 < (n8 = this.viewCacheCapacity); i3 += n3) {
                            Object[] objectArray;
                            view = Class.forName((String)((Object)arrayList));
                            Object object2 = new Class[n3];
                            object2[0] = objectArray = Context.class;
                            view = view.getConstructor((Class<?>)object2);
                            object2 = this.dynamicUI;
                            object2 = ((DynamicUI)object2).getAppContext();
                            objectArray = new Object[n3];
                            objectArray[0] = object2;
                            view = view.newInstance(objectArray);
                            view = view;
                            list.add(view);
                        }
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                    object = this.viewCache;
                    ((ConcurrentHashMap)object).put(arrayList, list);
                    arrayList = new ArrayList();
                    list = Collections.synchronizedList(arrayList);
                    break block6;
                }
                object = this.dynamicUI.getLogger();
                arrayList = ((Object)exception2).toString();
                view = "Error while initializing cache in function";
                object.e((String)view, (String)((Object)arrayList));
            }
            n7 += n3;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void lambda$replenishCache$1(String object) {
        int n3;
        int n4;
        Object object2;
        int n7 = 1;
        List<View> list = (ArrayList)this.viewCache.get(object);
        if (list == null) {
            list = new List<View>();
            list = Collections.synchronizedList(list);
            object2 = this.viewCache;
            ((ConcurrentHashMap)object2).put(object, list);
        }
        if ((n4 = list.size()) >= (n3 = this.viewCacheCapacity)) return;
        try {
            Class<Context> clazz;
            object = Class.forName((String)object);
            object2 = new Class[n7];
            object2[0] = clazz = Context.class;
            object = object.getConstructor((Class<?>)object2);
            object2 = this.dynamicUI;
            object2 = ((DynamicUI)object2).getAppContext();
            Object[] objectArray = new Object[n7];
            objectArray[0] = object2;
            object = object.newInstance(objectArray);
            list.add((View)object);
            return;
        }
        catch (Exception exception) {
            return;
        }
    }

    private void removeViewFromContainer(View view, String string2) {
        HashMap hashMap = this.container;
        if ((string2 = (ViewGroup)hashMap.get(string2)) != null) {
            int n3 = string2.indexOfChild(view);
            string2.removeViewAt(n3);
        }
    }

    private void render(View object, String charSequence) {
        Object object2 = this.container;
        charSequence = (ViewGroup)((HashMap)object2).get(charSequence);
        if (object != null && charSequence != null) {
            charSequence.addView((View)object);
        } else {
            object = this.dynamicUI.getErrorCallback();
            charSequence = new StringBuilder(" isNull : fn__Render -  instance null ");
            object2 = this.getErrorDetails();
            ((StringBuilder)charSequence).append((String)object2);
            charSequence = ((StringBuilder)charSequence).toString();
            object2 = "ERROR";
            object.onError((String)object2, (String)charSequence);
        }
    }

    public void addStoredViewToParent(String object, String charSequence, int n3, boolean bl2, String string2) {
        Object object2 = this.dynamicUI.getAppContext().getResources();
        Object object3 = this.dynamicUI.getAppContext().getPackageName();
        String string3 = "id";
        int n4 = object2.getIdentifier((String)object, string3, (String)object3);
        object2 = "ERROR";
        if (n3 >= 0) {
            DynamicUI dynamicUI;
            object3 = this.dynamicUI;
            if ((string2 = ((DynamicUI)object3).getContainer(string2)) == null) {
                object = this.dynamicUI.getErrorCallback();
                charSequence = new StringBuilder(" isNull : fn__addViewToParent - container null ");
                String string4 = this.getErrorDetails();
                ((StringBuilder)charSequence).append(string4);
                charSequence = ((StringBuilder)charSequence).toString();
                object.onError((String)object2, (String)charSequence);
                return;
            }
            object = (ViewGroup)string2.findViewById(n4);
            if (bl2) {
                object.removeAllViews();
            }
            if ((charSequence = (View)(dynamicUI = this.dynamicUI).getViewFromScreenName((String)charSequence)) != null) {
                dynamicUI = charSequence.getParent();
                if (dynamicUI != null) {
                    dynamicUI = (ViewGroup)charSequence.getParent();
                    dynamicUI.removeView((View)charSequence);
                }
                object.addView((View)charSequence, n3);
            } else {
                object = this.dynamicUI.getErrorCallback();
                charSequence = new StringBuilder(" isNull : fn__addViewToParent - child null ");
                String string5 = this.getErrorDetails();
                ((StringBuilder)charSequence).append(string5);
                charSequence = ((StringBuilder)charSequence).toString();
                object.onError((String)object2, (String)charSequence);
            }
        } else {
            object = this.dynamicUI.getErrorCallback();
            charSequence = new StringBuilder(" isNull : fn__addViewToParent - negative index ");
            String string6 = this.getErrorDetails();
            ((StringBuilder)charSequence).append(string6);
            charSequence = ((StringBuilder)charSequence).toString();
            object.onError((String)object2, (String)charSequence);
        }
    }

    public void addViewToParent(String object, JSONObject object2, int n3, boolean bl2, String object3) {
        Object object4 = this.dynamicUI.getAppContext().getResources();
        String string2 = this.dynamicUI.getAppContext().getPackageName();
        String string3 = "id";
        int n4 = object4.getIdentifier((String)object, string3, string2);
        object4 = this.dynamicUI;
        object3 = ((DynamicUI)object4).getContainer((String)object3);
        if (n3 >= 0 && object3 != null) {
            object = (ViewGroup)object3.findViewById(n4);
            if (bl2) {
                object.removeAllViews();
            }
            LinkedList linkedList = new LinkedList();
            object4 = this.dynamicUI;
            object3 = new InflateJSON((DynamicUI)object4);
            boolean bl3 = true;
            ((InflateView)object3).setUseAppContext(bl3);
            boolean bl4 = ((InflateView)object3).getUseAppContext();
            object2 = this.createAllNodesAndReturnRoot((JSONObject)object2, linkedList, bl4);
            this.addViewFromRenderTreeNodeQueue(linkedList);
            object.addView((View)object2, n3);
        } else {
            String string4;
            if (object3 == null) {
                object = this.dynamicUI.getLogger();
                string4 = "Missing Container";
                String string5 = "addViewToParent, InflateView, it is not  activity, it is applicationContext";
                object.e(string4, string5);
            }
            if ((n3 = (int)(object2.has((String)(object = "props")) ? 1 : 0)) != 0) {
                string4 = object2.getString("type");
                object = object2.getJSONObject((String)object);
                this.setCurrentNodeDetails(string4, (JSONObject)object);
            }
            object = this.dynamicUI.getErrorCallback();
            object2 = new StringBuilder(" isNull : fn__addViewToParent - negative index ");
            string4 = this.getErrorDetails();
            ((StringBuilder)object2).append(string4);
            object2 = ((StringBuilder)object2).toString();
            string4 = "ERROR";
            object.onError(string4, (String)object2);
        }
    }

    public View createView(JSONObject jSONObject) {
        Object object = jSONObject.getString("type");
        Object object2 = "props";
        JSONObject jSONObject2 = jSONObject.getJSONObject((String)object2);
        int n3 = jSONObject.has((String)object2);
        if (n3 != 0) {
            this.setCurrentNodeDetails((String)object, jSONObject2);
        }
        object = this.getNewInstanceFromClassName((String)object);
        object2 = jSONObject2.keys();
        Object object3 = this.dynamicUI;
        Object object4 = new InflateJSON((DynamicUI)object3);
        boolean bl2 = true;
        ((InflateView)object4).setUseAppContext(bl2);
        while (bl2 = object2.hasNext()) {
            object3 = (String)object2.next();
            InflateView inflateView = this.dynamicUI.getInflateView();
            boolean bl3 = ((InflateView)object4).getUseAppContext();
            inflateView.parseKeys((String)object3, jSONObject2, object, bl3);
        }
        object2 = "children";
        n3 = (jSONObject = jSONObject.getJSONArray((String)object2)).length();
        if (n3 != 0) {
            int n4;
            object2 = null;
            for (n3 = 0; n3 < (n4 = jSONObject.length()); ++n3) {
                jSONObject2 = jSONObject.getJSONObject(n3);
                if ((jSONObject2 = this.createView(jSONObject2)) == null) continue;
                object4 = object;
                object4 = (ViewGroup)object;
                object4.addView((View)jSONObject2);
            }
        }
        return (View)object;
    }

    public void dismissPopUp() {
        this.dynamicUI.getInflateView().dismissPopUp();
    }

    public View getCachedViewFor(String string2) {
        List list = (List)this.viewCache.get(string2);
        int n3 = 0;
        if (list == null) {
            return null;
        }
        int n4 = list.size();
        if (n4 == 0) {
            this.replenishCache(string2);
            return null;
        }
        list = (View)list.remove(0);
        n3 = this.viewCacheCapacity;
        if (n4 < n3) {
            this.replenishCache(string2);
        }
        return list;
    }

    public String getErrorDetails() {
        return this.dynamicUI.getInflateView().getErrorDetails();
    }

    public InflateView getInflateView() {
        return this.dynamicUI.getInflateView();
    }

    public void parseAndRunPipe(Object object, String string2, String string3, String string4, boolean bl2) {
        this.dynamicUI.getInflateView().setCurrView("modifyDom");
        this.dynamicUI.getInflateView().setCurrViewId("");
        InflateView inflateView = this.dynamicUI.getInflateView();
        StringBuilder stringBuilder = new StringBuilder("ln: ");
        stringBuilder.append(string3);
        stringBuilder.append(" ");
        stringBuilder.append(string4);
        string3 = stringBuilder.toString();
        inflateView.setFileOrigin(string3);
        this.dynamicUI.getInflateView().parseAndRunPipe(object, string2, bl2);
    }

    public void prepareAndStoreView(String string2, JSONObject jSONObject) {
        DynamicUI dynamicUI = this.dynamicUI;
        InflateJSON inflateJSON = new InflateJSON(dynamicUI);
        inflateJSON.setUseAppContext(true);
        jSONObject = this.createNodesAndReturnRoot(jSONObject, inflateJSON);
        this.dynamicUI.addToScreenMap(string2, jSONObject);
    }

    public void renderUI(JSONObject jSONObject, ViewGroup viewGroup, String string2) {
        this.renderUI(jSONObject, viewGroup, true, string2);
    }

    public void renderUI(JSONObject jSONObject, ViewGroup object, boolean bl2, String string2) {
        Object object2;
        if (string2 == null) {
            string2 = "default";
        }
        this.container.put(string2, object);
        object = new LinkedList();
        DynamicUI dynamicUI = this.dynamicUI;
        InflateJSON inflateJSON = new InflateJSON(dynamicUI);
        boolean bl3 = true;
        inflateJSON.setUseAppContext(bl3);
        boolean bl4 = inflateJSON.getUseAppContext();
        jSONObject = this.createAllNodesAndReturnRoot(jSONObject, (Queue)object, bl4);
        if (bl2 && (object2 = this.prevView.get(string2)) != jSONObject) {
            object2 = (View)this.prevView.get(string2);
            this.removeViewFromContainer((View)object2, string2);
        }
        this.addViewFromRenderTreeNodeQueue((Queue)object);
        this.render((View)jSONObject, string2);
        this.prevView.put(string2, jSONObject);
    }

    public void replenishCache(String string2) {
        sj2_2 sj2_22 = new sj2_2(this, string2);
        ExecutorManager.runOnBackgroundThread(sj2_22);
    }

    public void setCurrentNodeDetails(String string2, JSONObject object) {
        InflateView inflateView = this.dynamicUI.getInflateView();
        inflateView.setCurrView(string2);
        string2 = "node_id";
        boolean bl2 = object.has(string2);
        if (bl2) {
            string2 = object.getString(string2);
            inflateView = this.dynamicUI.getInflateView();
            inflateView.setCurrViewId(string2);
        }
        if (bl2 = object.has(string2 = "__filename")) {
            string2 = object.getString(string2);
            object = this.dynamicUI.getInflateView();
            ((InflateView)object).setFileOrigin(string2);
        }
    }
}

