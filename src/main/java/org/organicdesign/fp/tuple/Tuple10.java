// Copyright 2016 PlanBase Inc. & Glen Peterson
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.organicdesign.fp.tuple;

import java.io.Serializable;
import java.util.Objects;

import static org.organicdesign.fp.FunctionUtils.stringify;

// ======================================================================================
// THIS CLASS IS GENERATED BY /tupleGenerator/TupleGenerator.java.  DO NOT EDIT MANUALLY!
// ======================================================================================

/**
 Holds 10 items of potentially different types.  Designed to let you easily create immutable
 subclasses (to give your data structures meaningful names) with correct equals(), hashCode(), and
 toString() methods.
 */
public class Tuple10<A,B,C,D,E,F,G,H,I,J> implements Serializable {

    // For serializable.  Make sure to change whenever internal data format changes.
    // Implemented because implementing serializable only on a sub-class of an
    // immutable class requires a serialization proxy.  That's probably worse than
    // the conceptual burdeon of all tuples being Serializable.    private static final long serialVersionUID = 20160906065500L;

    // Fields are protected so that sub-classes can make accessor methods with meaningful names.
    protected final A _1;
    protected final B _2;
    protected final C _3;
    protected final D _4;
    protected final E _5;
    protected final F _6;
    protected final G _7;
    protected final H _8;
    protected final I _9;
    protected final J _10;

    /**
     Constructor is protected (not public) for easy inheritance.  Josh Bloch's "Item 1" says public
     static factory methods are better than constructors because they have names, they can return
     an existing object instead of a new one, and they can return a sub-type.  Therefore, you
     have more flexibility with a static factory as part of your public API then with a public
     constructor.
     */
    protected Tuple10(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j) {
        _1 = a; _2 = b; _3 = c; _4 = d; _5 = e; _6 = f; _7 = g; _8 = h; _9 = i;
        _10 = j;
    }

    /** Public static factory method */
    public static <A,B,C,D,E,F,G,H,I,J> Tuple10<A,B,C,D,E,F,G,H,I,J>
    of(A a, B b, C c, D d, E e, F f, G g, H h, I i, J j) {
        return new Tuple10<>(a, b, c, d, e, f, g, h, i, j);
    }

    /** Returns the 1st field */
    public A _1() { return _1; }
    /** Returns the 2nd field */
    public B _2() { return _2; }
    /** Returns the 3rd field */
    public C _3() { return _3; }
    /** Returns the 4th field */
    public D _4() { return _4; }
    /** Returns the 5th field */
    public E _5() { return _5; }
    /** Returns the 6th field */
    public F _6() { return _6; }
    /** Returns the 7th field */
    public G _7() { return _7; }
    /** Returns the 8th field */
    public H _8() { return _8; }
    /** Returns the 9th field */
    public I _9() { return _9; }
    /** Returns the 10th field */
    public J _10() { return _10; }

    @Override
    public String toString() {
        return getClass().getSimpleName() + "(" +
               stringify(_1) + "," + stringify(_2) + "," +
               stringify(_3) + "," + stringify(_4) + "," + stringify(_5) + "," +
               stringify(_6) + "," + stringify(_7) + "," + stringify(_8) + "," +
               stringify(_9) + "," + stringify(_10) + ")";
    }

    @Override
    public boolean equals(Object other) {
        // Cheapest operation first...
        if (this == other) { return true; }
        if (!(other instanceof Tuple10)) { return false; }
        // Details...
        @SuppressWarnings("rawtypes") final Tuple10 that = (Tuple10) other;

        return Objects.equals(this._1, that._1()) &&
               Objects.equals(this._2, that._2()) &&
               Objects.equals(this._3, that._3()) &&
               Objects.equals(this._4, that._4()) &&
               Objects.equals(this._5, that._5()) &&
               Objects.equals(this._6, that._6()) &&
               Objects.equals(this._7, that._7()) &&
               Objects.equals(this._8, that._8()) &&
               Objects.equals(this._9, that._9()) &&
               Objects.equals(this._10, that._10());
    }

    @Override
    public int hashCode() {
        // First 2 fields match Tuple2 which implements java.util.Map.Entry as part of the map
        // contract and therefore must match java.util.HashMap.Node.hashCode().
        int ret = 0;
        if (_1 != null) { ret = _1.hashCode(); }
        if (_2 != null) { ret = ret ^ _2.hashCode(); }
        if (_3 != null) { ret = ret + _3.hashCode(); }
        if (_4 != null) { ret = ret + _4.hashCode(); }
        if (_5 != null) { ret = ret + _5.hashCode(); }
        if (_6 != null) { ret = ret + _6.hashCode(); }
        if (_7 != null) { ret = ret + _7.hashCode(); }
        if (_8 != null) { ret = ret + _8.hashCode(); }
        if (_9 != null) { ret = ret + _9.hashCode(); }
        if (_10 != null) { ret = ret + _10.hashCode(); }
        return ret;
    }
}