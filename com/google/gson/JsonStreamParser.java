/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson;

import com.google.gson.JsonElement;
import com.google.gson.JsonIOException;
import com.google.gson.JsonParseException;
import com.google.gson.JsonSyntaxException;
import com.google.gson.internal.Streams;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class JsonStreamParser
implements Iterator {
    private final Object lock;
    private final JsonReader parser;

    public JsonStreamParser(Reader object) {
        JsonReader jsonReader;
        this.parser = jsonReader = new JsonReader((Reader)object);
        jsonReader.setLenient(true);
        this.lock = object = new Object();
    }

    public JsonStreamParser(String string2) {
        StringReader stringReader = new StringReader(string2);
        this(stringReader);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean hasNext() {
        Object object = this.lock;
        synchronized (object) {
            Throwable throwable2;
            block6: {
                MalformedJsonException malformedJsonException2;
                block7: {
                    try {
                        Object object2 = this.parser;
                        object2 = object2.peek();
                        JsonToken jsonToken = JsonToken.END_DOCUMENT;
                        if (object2 == jsonToken) return false;
                        return true;
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                    catch (IOException iOException) {
                    }
                    catch (MalformedJsonException malformedJsonException2) {
                        break block7;
                    }
                    JsonIOException jsonIOException = new JsonIOException(iOException);
                    throw jsonIOException;
                }
                JsonSyntaxException jsonSyntaxException = new JsonSyntaxException(malformedJsonException2);
                throw jsonSyntaxException;
            }
            throw throwable2;
        }
    }

    public JsonElement next() {
        Object object = "Failed parsing JSON source to Json";
        boolean bl2 = this.hasNext();
        if (bl2) {
            StackOverflowError stackOverflowError2;
            block6: {
                JsonReader jsonReader = this.parser;
                try {
                    return Streams.parse(jsonReader);
                }
                catch (OutOfMemoryError outOfMemoryError) {
                }
                catch (StackOverflowError stackOverflowError2) {
                    break block6;
                }
                JsonParseException jsonParseException = new JsonParseException((String)object, outOfMemoryError);
                throw jsonParseException;
            }
            JsonParseException jsonParseException = new JsonParseException((String)object, stackOverflowError2);
            throw jsonParseException;
        }
        object = new NoSuchElementException();
        throw object;
    }

    public void remove() {
        UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException();
        throw unsupportedOperationException;
    }
}

