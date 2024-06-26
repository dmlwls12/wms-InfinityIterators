package com.infinityiterators.bookwms.shipment.controller;

import com.infinityiterators.bookwms.shipment.model.OrderDTO;
import com.infinityiterators.bookwms.shipment.model.OutRecordDTO;
import com.infinityiterators.bookwms.shipment.model.StockOutDTO;

import java.util.List;

public class PrintResult {

    public void printShipmentList(List<OrderDTO> orderList) {
        System.out.println("=== 주문서 목록 ===");
        for (OrderDTO order : orderList) {
            System.out.println(order);
        }
        System.out.println("=================");
        // 내일 테이블에서 목록 받아오기
    }

    public void printErrorMessage(String errorCode) {
        String errorMessage = "";
        switch (errorCode) {
            case "update":
                errorMessage = "출고를 실패하였습니다.";
                break;
            case "soldOut":
                errorMessage = "품절처리에 실패했습니다.";
                break;
            case "outRecordDTO":
                errorCode = "출고 내역 처리에 실패했습니다.";
                break;
        }
        System.out.println(errorMessage);
    }

    public void printSuccessMessage(String successCode) {
        String successMessage = "";
        switch (successCode) {
            case "update":
                successMessage = "출고에 성공하였습니다.";
                break;
            case "soldOut":
                successMessage = "품절처리되었습니다.";
                break;
        }
        System.out.println(successMessage);
    }

    public void printOutRecordList(List<OutRecordDTO> list) {
        System.out.println("===출고내역 출력===");
        for (OutRecordDTO outRecordDTO : list) {
            System.out.println(outRecordDTO);
        }
        System.out.println("===========");
        // 아웃레코드디티오 불러오기?
    }
}
