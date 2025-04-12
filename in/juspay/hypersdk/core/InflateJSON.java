/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.json.JSONArray
 *  org.json.JSONObject
 */
package in.juspay.hypersdk.core;

import in.juspay.hypersdk.core.DuiLogger;
import in.juspay.hypersdk.core.DynamicUI;
import in.juspay.hypersdk.core.InflateJSON$Arguments;
import in.juspay.hypersdk.core.InflateView;
import in.juspay.hypersdk.core.InflateView$Cmd;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONObject;

public class InflateJSON
extends InflateView {
    private final String ARGS;
    private final String BODY;
    private final String CATCH;
    private final String COMMAND;
    private final String CONDITION;
    private final String CONDITIONS;
    private final String EXPLICIT_TYPE;
    private final String FUNCTION_STACK_NAME;
    private final String GLOBAL;
    private final String IF;
    private final String INVOKE_ON;
    private final String JSON_ARRAY;
    private final String JSON_OBJECT;
    private final String LOCAL;
    private final String METHOD_NAME;
    private final String NEW;
    private final String RETURN_TO;
    private final String RETURN_TYPE;
    private final String RUNIN_UI_JSON;
    private final String STATE;
    private final String STATIC;
    private final String TO;
    private final String TYPE;
    private final String VALUE;
    private final String VALUE_GET;
    private final String VALUE_SET;
    private final String VOID;
    private final String WHILE;
    private final HashMap constructorCache;
    private final AtomicInteger idCounter;
    private final HashMap localState;

    public InflateJSON(DynamicUI hashMap) {
        super((DynamicUI)((Object)hashMap));
        hashMap = new HashMap();
        this.constructorCache = hashMap;
        this.RUNIN_UI_JSON = "rj";
        this.JSON_ARRAY = "jsa";
        this.JSON_OBJECT = "jso";
        super(0);
        this.idCounter = hashMap;
        this.VALUE = "v";
        this.VOID = "vo";
        this.COMMAND = "c";
        this.CATCH = "ct";
        this.TYPE = "t";
        this.TO = "to";
        this.GLOBAL = "g";
        this.LOCAL = "lcl";
        this.STATE = "st";
        this.INVOKE_ON = "io";
        this.RETURN_TO = "rt";
        this.METHOD_NAME = "mn";
        this.ARGS = "a";
        this.NEW = "n";
        this.EXPLICIT_TYPE = "et";
        this.CONDITION = "cnd";
        this.CONDITIONS = "cnds";
        this.RETURN_TYPE = "rty";
        this.BODY = "bd";
        this.IF = "if";
        this.WHILE = "w";
        this.VALUE_SET = "vs";
        this.VALUE_GET = "vg";
        this.FUNCTION_STACK_NAME = "fnstk";
        this.STATIC = "stc";
        this.localState = hashMap = new HashMap();
    }

    public static /* synthetic */ Object access$200(InflateJSON inflateJSON, Object object, String string2) {
        return inflateJSON.getClassTypeFromObject(object, string2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private Object createNewInstance(Class genericDeclaration, Object[] objectArray, Class[] classArray) {
        GenericDeclaration genericDeclaration2;
        InflateView$Cmd inflateView$Cmd;
        HashMap hashMap;
        block11: {
            Object object;
            int n4;
            block10: {
                if (objectArray == null) return ((Class)genericDeclaration).newInstance();
                int n3 = objectArray.length;
                if (n3 == 0) {
                    return ((Class)genericDeclaration).newInstance();
                }
                hashMap = this.constructorCache;
                inflateView$Cmd = new InflateView$Cmd((Class)genericDeclaration, "new", classArray);
                boolean bl2 = hashMap.containsKey(inflateView$Cmd);
                if (bl2) {
                    genericDeclaration = (Constructor)this.constructorCache.get(inflateView$Cmd);
                    Objects.requireNonNull(genericDeclaration);
                    return ((Constructor)genericDeclaration).newInstance(objectArray);
                }
                bl2 = false;
                hashMap = null;
                try {
                    genericDeclaration2 = ((Class)genericDeclaration).getConstructor(classArray);
                }
                catch (NoSuchMethodException noSuchMethodException) {
                    genericDeclaration2 = null;
                    break block10;
                }
                try {
                    hashMap = genericDeclaration2.newInstance(objectArray);
                    break block11;
                }
                catch (NoSuchMethodException noSuchMethodException) {}
            }
            genericDeclaration = ((Class)genericDeclaration).getConstructors();
            int n7 = 0;
            if (classArray == null) {
                int n8;
                int n10 = objectArray.length;
                classArray = new Class[n10];
                for (n4 = 0; n4 < (n8 = objectArray.length); ++n4) {
                    object = objectArray[n4];
                    if (object == null) continue;
                    classArray[n4] = object = object.getClass();
                }
            }
            n4 = ((GenericDeclaration)genericDeclaration).length;
            while (n7 < n4) {
                int n14;
                object = genericDeclaration[n7];
                Class[] classArray2 = ((Constructor)object).getParameterTypes();
                int n15 = classArray2.length;
                if (n15 == (n14 = objectArray.length) && (n15 = (int)(this.matchTypes(classArray2 = ((Constructor)object).getParameterTypes(), classArray) ? 1 : 0)) != 0) {
                    hashMap = ((Constructor)object).newInstance(objectArray);
                    genericDeclaration2 = object;
                    break;
                }
                ++n7;
            }
        }
        this.constructorCache.put(inflateView$Cmd, genericDeclaration2);
        return hashMap;
    }

    private Object getClassTypeFromObject(Object clazz, String string2) {
        String string3 = "";
        boolean bl2 = string2.equals(string3);
        if (!bl2) {
            clazz = this.createPrimitiveClass(string2);
            if (clazz == null) {
                clazz = Class.forName(string2);
            }
            return clazz;
        }
        return clazz.getClass();
    }

    private Field getField(Class clazz, String string2) {
        return clazz.getDeclaredField(string2);
    }

    private Object getLocalStateValue(String object, LinkedList object2) {
        boolean bl2;
        object2 = ((LinkedList)object2).descendingIterator();
        while (bl2 = object2.hasNext()) {
            HashMap hashMap = this.localState;
            String string2 = (String)object2.next();
            boolean bl3 = hashMap.containsKey(string2);
            if (bl3) {
                hashMap = (HashMap)this.localState.get(string2);
                Objects.requireNonNull(hashMap);
                bl3 = hashMap.containsKey(object);
                if (!bl3) continue;
                object2 = (HashMap)this.localState.get(string2);
                Objects.requireNonNull(object2);
                return ((HashMap)object2).get(object);
            }
            object2 = kp1_0.c("local state not found for function ", string2);
            object = new Exception((String)object2);
            throw object;
        }
        return null;
    }

    private Object getStateValue(String string2) {
        return this.state.get(string2);
    }

    private Object invokeFunction(Method method, Object object, Object[] objectArray) {
        if (objectArray == null) {
            return method.invoke(object, null);
        }
        return method.invoke(object, objectArray);
    }

    private void saveOutput(Object object, JSONObject object2, LinkedList object3) {
        if (object2 == null) {
            return;
        }
        String string2 = object2.getString("to");
        object2 = object2.getString("v");
        String string3 = "g";
        boolean bl2 = string2.equals(string3);
        if (bl2) {
            object3 = this.getDUI();
            ((DynamicUI)object3).setGlobalState((String)object2, object);
        } else {
            string3 = "lcl";
            boolean bl3 = string2.equals(string3);
            if (bl3) {
                this.setLocalStateValue((String)object2, object, (LinkedList)object3);
            } else {
                object3 = this.state;
                ((HashMap)object3).put(object2, object);
            }
        }
    }

    private void setLocalStateValue(String string2, Object object, LinkedList object2) {
        object2 = (String)((LinkedList)object2).getLast();
        object2 = (HashMap)this.localState.get(object2);
        Objects.requireNonNull(object2);
        ((HashMap)object2).put(string2, object);
    }

    public Object callFunction(String string2, Object object, Object[] objectArray) {
        return this.callFunction(string2, object, objectArray, null);
    }

    public Object callFunction(String object, Object object2, Object[] objectArray, LinkedList linkedList) {
        HashMap<String, Object> hashMap = new HashMap<String, Object>();
        CharSequence charSequence = Ex0.a((String)object);
        AtomicInteger atomicInteger = this.idCounter;
        int n3 = atomicInteger.getAndIncrement();
        charSequence.append(n3);
        charSequence = charSequence.toString();
        if (linkedList == null) {
            linkedList = new LinkedList<StringBuilder>();
        }
        hashMap.put("fnstk", linkedList);
        this.localState.put(charSequence, hashMap);
        linkedList.add((StringBuilder)charSequence);
        hashMap.put("a", objectArray);
        object = this.getDUI().getFunction((String)object);
        object = this.runJSON(object2, (JSONArray)object, false, linkedList);
        linkedList.removeLast();
        this.localState.remove(charSequence);
        return object;
    }

    public Method findMethodInClassWithArgs(Class clazz, String string2, Class[] classArray) {
        InflateView$Cmd inflateView$Cmd = new InflateView$Cmd(clazz, string2, classArray);
        return this.findMethodWithCmd(inflateView$Cmd);
    }

    public Class getClassNameJSON(JSONObject object, Object object2) {
        boolean bl2;
        String string2 = object.getString("t");
        String string3 = object.optString("et");
        String string4 = "stc";
        boolean bl3 = string2.equals(string4);
        if (bl3) {
            string2 = "v";
            string3 = object.getString(string2);
        }
        if (!(bl2 = string3.equals(object = ""))) {
            return this.getClassName(string3);
        }
        if (object2 != null) {
            return object2.getClass();
        }
        object = new Exception("toRunOn is null");
        throw object;
    }

    public Object getValue(JSONObject object, Object object2, LinkedList linkedList) {
        String string2 = object.getString("t");
        String string3 = "jsa";
        boolean bl2 = string2.equals(string3);
        String string4 = "v";
        if (bl2) {
            return object.getJSONArray(string4);
        }
        string3 = "jso";
        bl2 = string2.equals(string3);
        if (bl2) {
            return object.getJSONObject(string4);
        }
        object = object.getString(string4);
        return this.getValueNew(string2, (String)object, object2, linkedList);
    }

    public Object getValueNew(String string2, String string3, Object object, LinkedList linkedList) {
        string2.getClass();
        int n3 = -1;
        int n4 = string2.hashCode();
        switch (n4) {
            default: {
                break;
            }
            case 3559070: {
                String string4 = "this";
                n4 = (int)(string2.equals(string4) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 7;
                break;
            }
            case 3237035: {
                String string5 = "infl";
                n4 = (int)(string2.equals(string5) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 6;
                break;
            }
            case 114210: {
                String string6 = "stc";
                n4 = (int)(string2.equals(string6) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 5;
                break;
            }
            case 106965: {
                String string7 = "lcl";
                n4 = (int)(string2.equals(string7) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 4;
                break;
            }
            case 98855: {
                String string8 = "ctx";
                n4 = (int)(string2.equals(string8) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 3;
                break;
            }
            case 96798: {
                String string9 = "apm";
                n4 = (int)(string2.equals(string9) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 2;
                break;
            }
            case 3681: {
                String string10 = "st";
                n4 = (int)(string2.equals(string10) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 1;
                break;
            }
            case 103: {
                String string11 = "g";
                n4 = (int)(string2.equals(string11) ? 1 : 0);
                if (n4 == 0) break;
                n3 = 0;
            }
        }
        switch (n3) {
            default: {
                return this.getValueNew(string2, string3);
            }
            case 7: {
                return object;
            }
            case 6: {
                return this;
            }
            case 5: {
                return null;
            }
            case 4: {
                return this.getLocalStateValue(string3, linkedList);
            }
            case 3: {
                string2 = this.dynamicUI.getActivity();
                if (string2 == null) {
                    string2 = this.dynamicUI.getAppContext();
                }
                return string2;
            }
            case 2: {
                return this.dynamicUI.getApplicationManager();
            }
            case 1: {
                return this.getStateValue(string3);
            }
            case 0: 
        }
        return this.getDUI().getGlobalState(string3);
    }

    public Object parseAndRunPipeJSON(Object object, JSONArray jSONArray, boolean bl2, LinkedList linkedList) {
        int n3;
        Object object2 = null;
        for (int i3 = 0; i3 < (n3 = jSONArray.length()); ++i3) {
            object2 = jSONArray.getJSONObject(i3);
            Object object3 = this.runCommandJSON((JSONObject)object2, object, bl2, linkedList);
            String string2 = "rt";
            boolean bl3 = object2.has(string2);
            if (bl3) {
                object2 = object2.getJSONObject(string2);
                this.saveOutput(object3, (JSONObject)object2, linkedList);
            }
            object2 = object3;
        }
        return object2;
    }

    public void parseKeys(String string2, JSONObject jSONObject, Object object, boolean bl2) {
        block4: {
            String string3 = "rj";
            boolean bl3 = string2.equals(string3);
            if (!bl3) break block4;
            string3 = jSONObject.getJSONArray(string3);
            bl3 = false;
            DuiLogger duiLogger = null;
            try {
                this.runJSON(object, (JSONArray)string3, bl2, null);
                return;
            }
            catch (Exception exception) {
                duiLogger = this.dynamicUI.getLogger();
                String string4 = "Error in parsing new infl ";
                CharSequence charSequence = new StringBuilder(string4);
                String string5 = exception.getMessage();
                charSequence.append(string5);
                string5 = charSequence.toString();
                charSequence = "WARNING";
                duiLogger.e((String)charSequence, string5);
            }
        }
        super.parseKeys(string2, jSONObject, object, bl2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public Object runCommandJSON(JSONObject jSONObject, Object classArray, boolean bl2, LinkedList linkedList) {
        int n3;
        int n4;
        String string2;
        boolean bl3;
        InflateJSON$Arguments inflateJSON$Arguments;
        String string3;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        int n7;
        int n8;
        LinkedList linkedList2;
        boolean bl4;
        Object[] objectArray;
        JSONArray jSONArray;
        InflateJSON inflateJSON;
        block19: {
            String string4;
            block20: {
                inflateJSON = this;
                jSONArray = jSONObject;
                objectArray = classArray;
                bl4 = bl2;
                linkedList2 = linkedList;
                n8 = 1;
                n7 = 0;
                object5 = null;
                object4 = jSONObject.optString("t", "c");
                object3 = jSONObject.optJSONObject("io");
                object2 = jSONObject.optString("mn", "");
                if (object3 != null) {
                    object = this.getValue((JSONObject)object3, classArray, linkedList);
                    object3 = this.getClassNameJSON((JSONObject)object3, object);
                    string3 = jSONObject.optJSONArray("a");
                    inflateJSON$Arguments = new InflateJSON$Arguments(this, (JSONArray)string3, classArray, linkedList);
                } else {
                    bl3 = false;
                    object3 = null;
                    object = null;
                    inflateJSON$Arguments = null;
                }
                object4.getClass();
                string3 = "bd";
                string2 = "cnd";
                int n10 = ((String)object4).hashCode();
                switch (n10) {
                    case 3773: {
                        string4 = "vs";
                        n4 = ((String)object4).equals(string4);
                        if (n4 == 0) break;
                        n3 = 3;
                        break block19;
                    }
                    case 3761: {
                        string4 = "vg";
                        n4 = ((String)object4).equals(string4);
                        if (n4 == 0) break;
                        n3 = 2;
                        break block19;
                    }
                    case 3357: {
                        string4 = "if";
                        n4 = ((String)object4).equals(string4);
                        if (n4 == 0) break;
                        n3 = 1;
                        break block19;
                    }
                    case 119: {
                        string4 = "w";
                        n4 = ((String)object4).equals(string4);
                        if (n4 != 0) break block20;
                    }
                }
                n3 = -1;
                break block19;
            }
            n3 = 0;
            string4 = null;
        }
        switch (n3) {
            default: {
                jSONArray = "n";
                boolean bl5 = ((String)object2).equals(jSONArray);
                if (bl5) {
                    Objects.requireNonNull(object3);
                    Objects.requireNonNull(inflateJSON$Arguments);
                    jSONArray = InflateJSON$Arguments.access$000(inflateJSON$Arguments);
                    objectArray = InflateJSON$Arguments.access$100(inflateJSON$Arguments);
                    return inflateJSON.createNewInstance((Class)object3, (Object[])jSONArray, (Class[])objectArray);
                }
                Objects.requireNonNull(inflateJSON$Arguments);
                jSONArray = InflateJSON$Arguments.access$100(inflateJSON$Arguments);
                jSONArray = inflateJSON.findMethodInClassWithArgs((Class)object3, (String)object2, (Class[])jSONArray);
                if (jSONArray != null) {
                    objectArray = InflateJSON$Arguments.access$000(inflateJSON$Arguments);
                    return inflateJSON.invokeFunction((Method)jSONArray, object, objectArray);
                }
                jSONArray = new Exception("Method not found");
                throw jSONArray;
            }
            case 3: {
                Objects.requireNonNull(object3);
                jSONArray = inflateJSON.getField((Class)object3, (String)object2);
                Objects.requireNonNull(inflateJSON$Arguments);
                objectArray = InflateJSON$Arguments.access$000(inflateJSON$Arguments)[0];
                jSONArray.set(object, objectArray);
                return null;
            }
            case 2: {
                Objects.requireNonNull(object3);
                return inflateJSON.getField((Class)object3, (String)object2).get(object);
            }
            case 1: {
                object4 = "cnds";
                jSONArray = jSONArray.getJSONArray((String)object4);
                while (n7 < (n4 = jSONArray.length())) {
                    object4 = jSONArray.getJSONObject(n7);
                    object3 = object4.getJSONArray(string2);
                    boolean bl6 = (object3 = inflateJSON.runJSON(objectArray, (JSONArray)object3, bl4, linkedList2)) instanceof Boolean;
                    if (bl6 && (bl3 = ((Boolean)(object3 = (Boolean)object3)).equals(object2 = Boolean.TRUE))) {
                        jSONArray = object4.getJSONArray(string3);
                        return inflateJSON.runJSON(objectArray, jSONArray, bl4, linkedList2);
                    }
                    n7 += n8;
                }
                return null;
            }
            case 0: {
                JSONArray jSONArray2 = jSONArray.getJSONArray(string2);
                jSONArray = jSONArray.getJSONArray(string3);
                while ((n4 = (object5 = inflateJSON.runJSON(objectArray, jSONArray2, bl4, linkedList2)) instanceof Boolean) != 0 && (n7 = (int)(((Boolean)(object5 = (Boolean)object5)).equals(object4 = Boolean.TRUE) ? 1 : 0)) != 0) {
                    inflateJSON.runJSON(objectArray, jSONArray, bl4, linkedList2);
                }
                break block6;
            }
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object runJSON(Object object, JSONArray object2, boolean bl2, LinkedList object3) {
        Object object4 = null;
        try {
            int n4;
            for (int n3 = 0; n3 < (n4 = object2.length()); ++n3) {
                JSONArray jSONArray = object2.getJSONArray(n3);
                object4 = this.parseAndRunPipeJSON(object, jSONArray, bl2, (LinkedList)object3);
            }
            return object4;
        }
        catch (Exception exception) {
            object2 = this.dynamicUI.getLogger();
            object3 = "Error in parsing new infl ";
            CharSequence charSequence = new StringBuilder((String)object3);
            String string2 = exception.getMessage();
            charSequence.append(string2);
            string2 = charSequence.toString();
            charSequence = "WARNING";
            object2.e((String)charSequence, string2);
        }
        return object4;
    }

    public Object runProps(JSONObject object, String charSequence, Object object2) {
        Class<?> clazz;
        boolean bl2;
        object = object.getJSONObject((String)charSequence);
        Object object3 = object.getJSONObject("props");
        Object object4 = object3.keys();
        while (bl2 = object4.hasNext()) {
            clazz = (String)object4.next();
            this.parseKeys((String)((Object)clazz), (JSONObject)object3, object2, false);
        }
        object3 = this.getState().get("rt");
        object4 = object.getString("rty");
        bl2 = ((String)object4).equals(clazz = "vo");
        if (bl2) {
            return null;
        }
        clazz = Class.forName((String)object4);
        boolean bl3 = clazz.isInstance(object3);
        if (bl3) {
            return object3;
        }
        DuiLogger duiLogger = this.getDUI().getLogger();
        String string2 = " expected ";
        String string3 = " got ";
        CharSequence charSequence2 = og_1.a("return type mismatch for method ", (String)charSequence, string2, (String)object4, string3);
        object3 = object3 != null ? object3.getClass().getName() : "result isnull";
        charSequence2.append((String)object3);
        object3 = charSequence2.toString();
        charSequence2 = "WARNING";
        duiLogger.e((String)charSequence2, (String)object3);
        object3 = "ct";
        object = object.getJSONArray((String)object3);
        object = this.runJSON(object2, (JSONArray)object, false, null);
        boolean bl4 = clazz.isInstance(object);
        if (bl4) {
            return object;
        }
        object2 = this.getDUI().getLogger();
        object3 = "return type mismatch for method on default";
        charSequence = og_1.a((String)object3, (String)charSequence, string2, (String)object4, string3);
        object = object == null ? "null" : object.getClass().getName();
        ((StringBuilder)charSequence).append((String)object);
        object = ((StringBuilder)charSequence).toString();
        object2.e((String)charSequence2, (String)object);
        return null;
    }
}

