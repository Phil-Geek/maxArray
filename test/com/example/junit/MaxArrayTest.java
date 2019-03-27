package com.example.junit;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxArrayTest {
    private MaxArray maxArray;
    @Before
    public void setUp() throws Exception {
        maxArray = new MaxArray();
    }

    @Test
    public void maxArrAsc() {
        int[] arr={1,2,7,2,5,6};
        int reqLength = 2;
        assertEquals(11,maxArray.maxArr(arr,reqLength));
    }
    @Test
    public void maxArrDes() {
        int[] arr={6,5,4,3,2,1};
        int reqLength = 3;
        assertEquals(15,maxArray.maxArr(arr,reqLength));
    }
    @Test
    public void maxArrNegAsc() {
        int[] arr={-5,-4,3,2,-1,10};
        int reqLength = 3;
        assertEquals(11,maxArray.maxArr(arr,reqLength));
    }
    @Test
    public void maxArrNegDes() {
        int[] arr={-1,-2,-3,-4,-5,-6};
        int reqLength = 3;
        assertEquals(-6,maxArray.maxArr(arr,reqLength));
    }
    @Test
    public void maxArrReqLen() {
        int[] arr={7,1,-5,-1,12,10,-9,-2,1,0,-12,};
        int reqLength = 4;
        assertEquals(16,maxArray.maxArr(arr,reqLength));
    }
    @Test
    public void maxArrAddLen() {
        int[] arr={-1,-2,-3,-4,-5,-6,-7,-8,-9,-10};
        int reqLength = 4;
        assertEquals(-10,maxArray.maxArr(arr,reqLength));
    }
    @Test
    public void maxArrImpJudge() {
        int[] arr={-1,-2,-3,-4,5,6,7,-8,-9,-10};
        int reqLength = 3;
        assertEquals(18,maxArray.maxArr(arr,reqLength));
    }
}