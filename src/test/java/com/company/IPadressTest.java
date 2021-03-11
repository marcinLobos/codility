package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IPadressTest {

    @Test
    void getBroadcast() {

        // given
        String ipHost = "192.168.1.145";
        String mask = "255.255.255.128";

        // when
        String ipNet = IPadress.getIPOfNetwork(ipHost, mask);
        String broadExpexted = "192.168.1.255";
        String broad = IPadress.getBroadcast(ipNet, mask);
        // then
        assertEquals(broadExpexted, broad);

    }

    @Test
    void getIPOfNetwork() {

        // given
        String ipHost = "192.168.1.145";
        String mask = "255.255.255.128";

        // when
        String ipNetExpected = "192.168.1.128";
        String ipNet = IPadress.getIPOfNetwork(ipHost, mask);

        // then
        assertEquals(ipNetExpected, ipNet);

    }
}