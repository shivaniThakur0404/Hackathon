package com.hack.hackathon;

import java.util.List;
import java.io.Serializable;
/**
 * Created by consultadd on 1/12/16.
 */

public class jsonJava implements Serializable {

    /**
     * appliances : {"applianceSize":"compact","appliances":[{"configuredDataStore":{"id":"datastore-26","isValid":true,"name":"XIO-2"},"configuredResourcePool":{"id":"resgroup-60","isValid":true,"name":"NEI"},"cpuReservation":{"reservation":1000},"customFields":[],"datastoreId":"datastore-26","datastoreName":"XIO-2","deployed":true,"edgeId":"edge-4","highAvailabilityIndex":0,"hostId":"host-41","hostName":"10.244.155.23","memoryReservation":{"reservation":512},"resourcePoolId":"resgroup-60","resourcePoolName":"NEI","vcUuid":"503cca84-f2e8-650c-e6d2-1a2792c60539","vmFolderId":"group-v3","vmFolderName":"vm","vmHostname":"NSX-edge-4-0","vmId":"vm-139","vmName":"Tenant_ESG1-0"}],"deployAppliances":true}
     * autoConfiguration : {"enabled":true,"rulePriority":"high"}
     * cliSettings : {"passwordExpiry":"99999","remoteAccess":true,"sshLoginBannerText":"\n***************************************************************************\nNOTICE TO USERS\n\n\nThis computer system is the private property of its owner, whether\nindividual, corporate or government.  It is for authorized use only.\nUsers (authorized or unauthorized) have no explicit or implicit\nexpectation of privacy.\n\nAny or all uses of this system and all files on this system may be\nintercepted, monitored, recorded, copied, audited, inspected, and\ndisclosed to your employer, to authorized site, government, and law\nenforcement personnel, as well as authorized officials of government\nagencies, both domestic and foreign.\n\nBy using this system, the user consents to such interception, monitoring,\nrecording, copying, auditing, inspection, and disclosure at the\ndiscretion of such personnel or officials.  Unauthorized or improper use\nof this system may result in civil and criminal penalties and\nadministrative or disciplinary action, as appropriate. By continuing to\nuse this system you indicate your awareness of and consent to these terms\nand conditions of use. LOG OFF IMMEDIATELY if you do not agree to the\nconditions stated in this warning.\n\n****************************************************************************","userName":"admin"}
     * datacenterMoid : datacenter-2
     * datacenterName : EHC1
     * enableAesni : true
     * enableFips : false
     * featureConfigs : {"features":[{"enabled":false,"featureType":"l2vpn","logging":{"enable":true,"logLevel":"notice"},"version":11},{"featureType":"FeatureConfigDto"},{"defaultPolicy":{"action":"deny","loggingEnabled":false},"enabled":false,"featureType":"firewall_4.0","firewallRules":{"firewallRules":[{"action":"accept","application":{"applicationId":[],"service":[{"port":["179"],"protocol":"tcp","sourcePort":["any"]}]},"description":"routing","enabled":true,"loggingEnabled":false,"name":"routing","ruleId":131075,"ruleTag":131075,"ruleType":"internal_high"},{"action":"deny","description":"default rule for ingress traffic","enabled":true,"loggingEnabled":false,"name":"default rule for ingress traffic","ruleId":131073,"ruleTag":131073,"ruleType":"default_policy"}]},"globalConfig":{"dropInvalidTraffic":true,"enableSynFloodProtection":false,"icmp6Timeout":10,"icmpTimeout":10,"ipGenericTimeout":120,"logInvalidTraffic":false,"tcpAllowOutOfWindowPackets":false,"tcpPickOngoingConnections":false,"tcpSendResetForClosedVsePorts":true,"tcpTimeoutClose":30,"tcpTimeoutEstablished":21600,"tcpTimeoutOpen":30,"udpTimeout":60},"version":29},{"cacheSize":16,"dnsViews":{"dnsView":[{"enabled":true,"name":"vsm-default-view","recursion":false,"viewId":"view-0","viewMatch":{"ipAddress":["any"],"ipSet":[],"vnic":["any"]}}]},"enabled":false,"featureType":"dns","listeners":{"type":"dhs_listener","vnic":["any"]},"logging":{"enable":false,"logLevel":"info"},"version":11},{"advancedConfig":{"clientNotification":"","enableCompression":false,"enablePublicUrlAccess":false,"forceVirtualKeyboard":false,"preventMultipleLogon":false,"randomizeVirtualkeys":false,"timeout":{"forcedTimeout":0,"sessionIdleTimeout":10}},"authenticationConfiguration":{"passwordAuthentication":{"authenticationTimeout":1,"primaryAuthServers":{},"secondaryAuthServer":{}}},"clientConfiguration":{"autoReconnect":true,"upgradeNotification":false},"enabled":false,"featureType":"sslvpn_4.0","layoutConfigurationDto":{"bodyColor":"FFFFFF","companyName":"VMware","logoBackgroundColor":"56A2D4","logoExtention":"jpg","logoUri":"/api/4.0/edges/edge-4/sslvpn/config/layout/images/portallogo","menuBarColor":"999999","portalTitle":"VMware","rowAlternativeColor":"FFFFFF","rowColor":"F5F5F5","titleColor":"996600","topFrameColor":"000000"},"logging":{"enable":true,"logLevel":"notice"},"version":11},{"bgp":{"bgpNeighbours":{"bgpNeighbours":[{"bgpFilters":{"bgpFilters":[]},"holdDownTimer":3,"ipAddress":"172.21.254.25","keepAliveTimer":1,"remoteAS":65200,"weight":60},{"bgpFilters":{"bgpFilters":[{"action":"permit","direction":"out","network":"172.21.3.0/24"}]},"holdDownTimer":180,"ipAddress":"10.244.201.1","keepAliveTimer":60,"remoteAS":65301,"weight":60},{"bgpFilters":{"bgpFilters":[{"action":"permit","direction":"out","network":"172.21.3.0/24"}]},"holdDownTimer":180,"ipAddress":"10.244.202.1","keepAliveTimer":60,"remoteAS":65302,"weight":60}]},"defaultOriginate":false,"enabled":true,"gracefulRestart":true,"localAS":65200,"redistribution":{"enabled":true,"rules":{"rules":[{"action":"permit","from":{"bgp":false,"connected":true,"ospf":false,"static":false},"id":0}]}}},"enabled":true,"featureType":"routing_4.0","ospf":{"defaultOriginate":false,"enabled":false,"gracefulRestart":true,"ospfAreas":{"ospfAreas":[{"areaId":51,"authentication":{"type":"none"},"type":"nssa"},{"areaId":0,"authentication":{"type":"none"},"type":"normal"}]},"ospfInterfaces":{"ospfInterfaces":[]},"redistribution":{"enabled":false,"rules":{"rules":[]}}},"routingGlobalConfig":{"ecmp":true,"logging":{"enable":false,"logLevel":"info"},"routerId":"10.244.201.11"},"staticRouting":{"staticRoutes":{"staticRoutes":[]}},"version":30},{"declareDeadTime":6,"enabled":false,"featureType":"highavailability_4.0","logging":{"enable":false,"logLevel":"info"},"security":{"enabled":false},"version":11},{"enabled":false,"featureType":"syslog","version":1},{"featureType":"FeatureConfigDto"},{"accelerationEnabled":false,"applicationProfile":[],"applicationRule":[],"enableServiceInsertion":false,"enabled":false,"featureType":"loadbalancer_4.0","logging":{"enable":false,"logLevel":"info"},"monitor":[{"interval":5,"maxRetries":3,"monitorId":"monitor-1","name":"default_tcp_monitor","timeout":15,"type":"tcp"},{"interval":5,"maxRetries":3,"method":"GET","monitorId":"monitor-2","name":"default_http_monitor","timeout":15,"type":"http","url":"/"},{"interval":5,"maxRetries":3,"method":"GET","monitorId":"monitor-3","name":"default_https_monitor","timeout":15,"type":"https","url":"/"}],"pool":[],"version":1,"virtualServer":[]},{"enabled":false,"featureType":"gslb","logging":{"enable":false,"logLevel":"info"},"version":1},{"enabled":false,"featureType":"ipsec_4.0","global":{"caCertificates":{"caCertificate":[]},"crlCertificates":{"crlCertificate":[]},"psk":"******"},"logging":{"enable":true,"logLevel":"warning"},"sites":{"sites":[]},"version":1},{"enabled":false,"featureType":"dhcp_4.0","ipPools":{"ipPools":[]},"logging":{"enable":false,"logLevel":"info"},"staticBindings":{"staticBindings":[]},"version":11},{"bridges":[],"enabled":false,"featureType":"bridging","version":11},{"enabled":true,"featureType":"nat","rules":{"natRulesDtos":[]},"version":11},{"featureType":"FeatureConfigDto"}]}
     * fqdn : NSX-edge-4
     * hypervisorAssist : false
     * id : edge-4
     * isUniversal : false
     * name : Tenant_ESG1
     * queryDaemon : {"enabled":false,"port":"5666"}
     * status : deployed
     * tenant : default
     * type : gatewayServices
     * version : 31
     * vnics : {"vnics":[{"addressGroups":{"addressGroups":[{"primaryAddress":"172.21.254.18","subnetMask":"255.255.255.240","subnetPrefixLength":"28"}]},"enableProxyArp":false,"enableSendRedirects":false,"fenceParameters":[],"index":0,"isConnected":true,"label":"vNic_0","mtu":1500,"name":"Internal","portgroupId":"virtualwire-2","portgroupName":"Tenant_Transit_Logical_Local","type":"internal"},{"addressGroups":{"addressGroups":[{"primaryAddress":"10.244.201.11","subnetMask":"255.255.255.0","subnetPrefixLength":"24"}]},"enableProxyArp":false,"enableSendRedirects":true,"fenceParameters":[],"index":1,"isConnected":true,"label":"vNic_1","mtu":1500,"name":"uplink_201","portgroupId":"dvportgroup-145","portgroupName":"EXT_VLAN_201a","type":"uplink"},{"addressGroups":{"addressGroups":[{"primaryAddress":"10.244.202.11","subnetMask":"255.255.255.0","subnetPrefixLength":"24"}]},"enableProxyArp":false,"enableSendRedirects":true,"fenceParameters":[],"index":2,"isConnected":true,"label":"vNic_2","mtu":1500,"name":"uplink_202","portgroupId":"dvportgroup-165","portgroupName":"EXT_VLAN_202a","type":"uplink"},{"addressGroups":{"addressGroups":[]},"enableProxyArp":false,"enableSendRedirects":true,"fenceParameters":[],"index":3,"isConnected":false,"label":"vNic_3","mtu":1500,"name":"vnic3","type":"internal"},{"addressGroups":{"addressGroups":[]},"enableProxyArp":false,"enableSendRedirects":true,"fenceParameters":[],"index":4,"isConnected":false,"label":"vNic_4","mtu":1500,"name":"vnic4","type":"internal"},{"addressGroups":{"addressGroups":[]},"enableProxyArp":false,"enableSendRedirects":true,"fenceParameters":[],"index":5,"isConnected":false,"label":"vNic_5","mtu":1500,"name":"vnic5","type":"internal"},{"addressGroups":{"addressGroups":[]},"enableProxyArp":false,"enableSendRedirects":true,"fenceParameters":[],"index":6,"isConnected":false,"label":"vNic_6","mtu":1500,"name":"vnic6","type":"internal"},{"addressGroups":{"addressGroups":[]},"enableProxyArp":false,"enableSendRedirects":true,"fenceParameters":[],"index":7,"isConnected":false,"label":"vNic_7","mtu":1500,"name":"vnic7","type":"internal"},{"addressGroups":{"addressGroups":[]},"enableProxyArp":false,"enableSendRedirects":true,"fenceParameters":[],"index":8,"isConnected":false,"label":"vNic_8","mtu":1500,"name":"vnic8","type":"internal"},{"addressGroups":{"addressGroups":[]},"enableProxyArp":false,"enableSendRedirects":true,"fenceParameters":[],"index":9,"isConnected":false,"label":"vNic_9","mtu":1500,"name":"vnic9","type":"internal"}]}
     * vseLogLevel : emergency
     */

    private AppliancesBeanX appliances;
    private AutoConfigurationBean autoConfiguration;
    private CliSettingsBean cliSettings;
    private String datacenterMoid;
    private String datacenterName;
    private boolean enableAesni;
    private boolean enableFips;
    private FeatureConfigsBean featureConfigs;
    private String fqdn;
    private boolean hypervisorAssist;
    private String id;
    private boolean isUniversal;
    private String name;
    private QueryDaemonBean queryDaemon;
    private String status;
    private String tenant;
    private String type;
    private int version;
    private VnicsBeanX vnics;
    private String vseLogLevel;

    public AppliancesBeanX getAppliances() {
        return appliances;
    }

    public void setAppliances(AppliancesBeanX appliances) {
        this.appliances = appliances;
    }

    public AutoConfigurationBean getAutoConfiguration() {
        return autoConfiguration;
    }

    public void setAutoConfiguration(AutoConfigurationBean autoConfiguration) {
        this.autoConfiguration = autoConfiguration;
    }

    public CliSettingsBean getCliSettings() {
        return cliSettings;
    }

    public void setCliSettings(CliSettingsBean cliSettings) {
        this.cliSettings = cliSettings;
    }

    public String getDatacenterMoid() {
        return datacenterMoid;
    }

    public void setDatacenterMoid(String datacenterMoid) {
        this.datacenterMoid = datacenterMoid;
    }

    public String getDatacenterName() {
        return datacenterName;
    }

    public void setDatacenterName(String datacenterName) {
        this.datacenterName = datacenterName;
    }

    public boolean isEnableAesni() {
        return enableAesni;
    }

    public void setEnableAesni(boolean enableAesni) {
        this.enableAesni = enableAesni;
    }

    public boolean isEnableFips() {
        return enableFips;
    }

    public void setEnableFips(boolean enableFips) {
        this.enableFips = enableFips;
    }

    public FeatureConfigsBean getFeatureConfigs() {
        return featureConfigs;
    }

    public void setFeatureConfigs(FeatureConfigsBean featureConfigs) {
        this.featureConfigs = featureConfigs;
    }

    public String getFqdn() {
        return fqdn;
    }

    public void setFqdn(String fqdn) {
        this.fqdn = fqdn;
    }

    public boolean isHypervisorAssist() {
        return hypervisorAssist;
    }

    public void setHypervisorAssist(boolean hypervisorAssist) {
        this.hypervisorAssist = hypervisorAssist;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isIsUniversal() {
        return isUniversal;
    }

    public void setIsUniversal(boolean isUniversal) {
        this.isUniversal = isUniversal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public QueryDaemonBean getQueryDaemon() {
        return queryDaemon;
    }

    public void setQueryDaemon(QueryDaemonBean queryDaemon) {
        this.queryDaemon = queryDaemon;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTenant() {
        return tenant;
    }

    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public VnicsBeanX getVnics() {
        return vnics;
    }

    public void setVnics(VnicsBeanX vnics) {
        this.vnics = vnics;
    }

    public String getVseLogLevel() {
        return vseLogLevel;
    }

    public void setVseLogLevel(String vseLogLevel) {
        this.vseLogLevel = vseLogLevel;
    }

    public static class AppliancesBeanX implements Serializable {
        /**
         * applianceSize : compact
         * appliances : [{"configuredDataStore":{"id":"datastore-26","isValid":true,"name":"XIO-2"},"configuredResourcePool":{"id":"resgroup-60","isValid":true,"name":"NEI"},"cpuReservation":{"reservation":1000},"customFields":[],"datastoreId":"datastore-26","datastoreName":"XIO-2","deployed":true,"edgeId":"edge-4","highAvailabilityIndex":0,"hostId":"host-41","hostName":"10.244.155.23","memoryReservation":{"reservation":512},"resourcePoolId":"resgroup-60","resourcePoolName":"NEI","vcUuid":"503cca84-f2e8-650c-e6d2-1a2792c60539","vmFolderId":"group-v3","vmFolderName":"vm","vmHostname":"NSX-edge-4-0","vmId":"vm-139","vmName":"Tenant_ESG1-0"}]
         * deployAppliances : true
         */

        private String applianceSize;
        private boolean deployAppliances;
        private List<AppliancesBean> appliances;

        public String getApplianceSize() {
            return applianceSize;
        }

        public void setApplianceSize(String applianceSize) {
            this.applianceSize = applianceSize;
        }

        public boolean isDeployAppliances() {
            return deployAppliances;
        }

        public void setDeployAppliances(boolean deployAppliances) {
            this.deployAppliances = deployAppliances;
        }

        public List<AppliancesBean> getAppliances() {
            return appliances;
        }

        public void setAppliances(List<AppliancesBean> appliances) {
            this.appliances = appliances;
        }

        public static class AppliancesBean implements Serializable {
            /**
             * configuredDataStore : {"id":"datastore-26","isValid":true,"name":"XIO-2"}
             * configuredResourcePool : {"id":"resgroup-60","isValid":true,"name":"NEI"}
             * cpuReservation : {"reservation":1000}
             * customFields : []
             * datastoreId : datastore-26
             * datastoreName : XIO-2
             * deployed : true
             * edgeId : edge-4
             * highAvailabilityIndex : 0
             * hostId : host-41
             * hostName : 10.244.155.23
             * memoryReservation : {"reservation":512}
             * resourcePoolId : resgroup-60
             * resourcePoolName : NEI
             * vcUuid : 503cca84-f2e8-650c-e6d2-1a2792c60539
             * vmFolderId : group-v3
             * vmFolderName : vm
             * vmHostname : NSX-edge-4-0
             * vmId : vm-139
             * vmName : Tenant_ESG1-0
             */

            private ConfiguredDataStoreBean configuredDataStore;
            private ConfiguredResourcePoolBean configuredResourcePool;
            private CpuReservationBean cpuReservation;
            private String datastoreId;
            private String datastoreName;
            private boolean deployed;
            private String edgeId;
            private int highAvailabilityIndex;
            private String hostId;
            private String hostName;
            private MemoryReservationBean memoryReservation;
            private String resourcePoolId;
            private String resourcePoolName;
            private String vcUuid;
            private String vmFolderId;
            private String vmFolderName;
            private String vmHostname;
            private String vmId;
            private String vmName;
            private List<?> customFields;

            public ConfiguredDataStoreBean getConfiguredDataStore() {
                return configuredDataStore;
            }

            public void setConfiguredDataStore(ConfiguredDataStoreBean configuredDataStore) {
                this.configuredDataStore = configuredDataStore;
            }

            public ConfiguredResourcePoolBean getConfiguredResourcePool() {
                return configuredResourcePool;
            }

            public void setConfiguredResourcePool(ConfiguredResourcePoolBean configuredResourcePool) {
                this.configuredResourcePool = configuredResourcePool;
            }

            public CpuReservationBean getCpuReservation() {
                return cpuReservation;
            }

            public void setCpuReservation(CpuReservationBean cpuReservation) {
                this.cpuReservation = cpuReservation;
            }

            public String getDatastoreId() {
                return datastoreId;
            }

            public void setDatastoreId(String datastoreId) {
                this.datastoreId = datastoreId;
            }

            public String getDatastoreName() {
                return datastoreName;
            }

            public void setDatastoreName(String datastoreName) {
                this.datastoreName = datastoreName;
            }

            public boolean isDeployed() {
                return deployed;
            }

            public void setDeployed(boolean deployed) {
                this.deployed = deployed;
            }

            public String getEdgeId() {
                return edgeId;
            }

            public void setEdgeId(String edgeId) {
                this.edgeId = edgeId;
            }

            public int getHighAvailabilityIndex() {
                return highAvailabilityIndex;
            }

            public void setHighAvailabilityIndex(int highAvailabilityIndex) {
                this.highAvailabilityIndex = highAvailabilityIndex;
            }

            public String getHostId() {
                return hostId;
            }

            public void setHostId(String hostId) {
                this.hostId = hostId;
            }

            public String getHostName() {
                return hostName;
            }

            public void setHostName(String hostName) {
                this.hostName = hostName;
            }

            public MemoryReservationBean getMemoryReservation() {
                return memoryReservation;
            }

            public void setMemoryReservation(MemoryReservationBean memoryReservation) {
                this.memoryReservation = memoryReservation;
            }

            public String getResourcePoolId() {
                return resourcePoolId;
            }

            public void setResourcePoolId(String resourcePoolId) {
                this.resourcePoolId = resourcePoolId;
            }

            public String getResourcePoolName() {
                return resourcePoolName;
            }

            public void setResourcePoolName(String resourcePoolName) {
                this.resourcePoolName = resourcePoolName;
            }

            public String getVcUuid() {
                return vcUuid;
            }

            public void setVcUuid(String vcUuid) {
                this.vcUuid = vcUuid;
            }

            public String getVmFolderId() {
                return vmFolderId;
            }

            public void setVmFolderId(String vmFolderId) {
                this.vmFolderId = vmFolderId;
            }

            public String getVmFolderName() {
                return vmFolderName;
            }

            public void setVmFolderName(String vmFolderName) {
                this.vmFolderName = vmFolderName;
            }

            public String getVmHostname() {
                return vmHostname;
            }

            public void setVmHostname(String vmHostname) {
                this.vmHostname = vmHostname;
            }

            public String getVmId() {
                return vmId;
            }

            public void setVmId(String vmId) {
                this.vmId = vmId;
            }

            public String getVmName() {
                return vmName;
            }

            public void setVmName(String vmName) {
                this.vmName = vmName;
            }

            public List<?> getCustomFields() {
                return customFields;
            }

            public void setCustomFields(List<?> customFields) {
                this.customFields = customFields;
            }

            public static class ConfiguredDataStoreBean  implements Serializable {
                /**
                 * id : datastore-26
                 * isValid : true
                 * name : XIO-2
                 */

                private String id;
                private boolean isValid;
                private String name;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isIsValid() {
                    return isValid;
                }

                public void setIsValid(boolean isValid) {
                    this.isValid = isValid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class ConfiguredResourcePoolBean  implements Serializable{
                /**
                 * id : resgroup-60
                 * isValid : true
                 * name : NEI
                 */

                private String id;
                private boolean isValid;
                private String name;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public boolean isIsValid() {
                    return isValid;
                }

                public void setIsValid(boolean isValid) {
                    this.isValid = isValid;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }
            }

            public static class CpuReservationBean implements Serializable {
                /**
                 * reservation : 1000
                 */

                private int reservation;

                public int getReservation() {
                    return reservation;
                }

                public void setReservation(int reservation) {
                    this.reservation = reservation;
                }
            }

            public static class MemoryReservationBean implements Serializable {
                /**
                 * reservation : 512
                 */

                private int reservation;

                public int getReservation() {
                    return reservation;
                }

                public void setReservation(int reservation) {
                    this.reservation = reservation;
                }
            }
        }
    }

    public static class AutoConfigurationBean  implements Serializable{
        /**
         * enabled : true
         * rulePriority : high
         */

        private boolean enabled;
        private String rulePriority;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public String getRulePriority() {
            return rulePriority;
        }

        public void setRulePriority(String rulePriority) {
            this.rulePriority = rulePriority;
        }
    }

    public static class CliSettingsBean  implements Serializable{
        /**
         * passwordExpiry : 99999
         * remoteAccess : true
         * sshLoginBannerText :
         ***************************************************************************
         NOTICE TO USERS


         This computer system is the private property of its owner, whether
         individual, corporate or government.  It is for authorized use only.
         Users (authorized or unauthorized) have no explicit or implicit
         expectation of privacy.

         Any or all uses of this system and all files on this system may be
         intercepted, monitored, recorded, copied, audited, inspected, and
         disclosed to your employer, to authorized site, government, and law
         enforcement personnel, as well as authorized officials of government
         agencies, both domestic and foreign.

         By using this system, the user consents to such interception, monitoring,
         recording, copying, auditing, inspection, and disclosure at the
         discretion of such personnel or officials.  Unauthorized or improper use
         of this system may result in civil and criminal penalties and
         administrative or disciplinary action, as appropriate. By continuing to
         use this system you indicate your awareness of and consent to these terms
         and conditions of use. LOG OFF IMMEDIATELY if you do not agree to the
         conditions stated in this warning.

         ****************************************************************************
         * userName : admin
         */

        private String passwordExpiry;
        private boolean remoteAccess;
        private String sshLoginBannerText;
        private String userName;

        public String getPasswordExpiry() {
            return passwordExpiry;
        }

        public void setPasswordExpiry(String passwordExpiry) {
            this.passwordExpiry = passwordExpiry;
        }

        public boolean isRemoteAccess() {
            return remoteAccess;
        }

        public void setRemoteAccess(boolean remoteAccess) {
            this.remoteAccess = remoteAccess;
        }

        public String getSshLoginBannerText() {
            return sshLoginBannerText;
        }

        public void setSshLoginBannerText(String sshLoginBannerText) {
            this.sshLoginBannerText = sshLoginBannerText;
        }

        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }
    }

    public static class FeatureConfigsBean implements Serializable {
        private List<FeaturesBean> features;

        public List<FeaturesBean> getFeatures() {
            return features;
        }

        public void setFeatures(List<FeaturesBean> features) {
            this.features = features;
        }

        public static class FeaturesBean  implements Serializable{
            /**
             * enabled : false
             * featureType : l2vpn
             * logging : {"enable":true,"logLevel":"notice"}
             * version : 11
             * defaultPolicy : {"action":"deny","loggingEnabled":false}
             * firewallRules : {"firewallRules":[{"action":"accept","application":{"applicationId":[],"service":[{"port":["179"],"protocol":"tcp","sourcePort":["any"]}]},"description":"routing","enabled":true,"loggingEnabled":false,"name":"routing","ruleId":131075,"ruleTag":131075,"ruleType":"internal_high"},{"action":"deny","description":"default rule for ingress traffic","enabled":true,"loggingEnabled":false,"name":"default rule for ingress traffic","ruleId":131073,"ruleTag":131073,"ruleType":"default_policy"}]}
             * globalConfig : {"dropInvalidTraffic":true,"enableSynFloodProtection":false,"icmp6Timeout":10,"icmpTimeout":10,"ipGenericTimeout":120,"logInvalidTraffic":false,"tcpAllowOutOfWindowPackets":false,"tcpPickOngoingConnections":false,"tcpSendResetForClosedVsePorts":true,"tcpTimeoutClose":30,"tcpTimeoutEstablished":21600,"tcpTimeoutOpen":30,"udpTimeout":60}
             * cacheSize : 16
             * dnsViews : {"dnsView":[{"enabled":true,"name":"vsm-default-view","recursion":false,"viewId":"view-0","viewMatch":{"ipAddress":["any"],"ipSet":[],"vnic":["any"]}}]}
             * listeners : {"type":"dhs_listener","vnic":["any"]}
             * advancedConfig : {"clientNotification":"","enableCompression":false,"enablePublicUrlAccess":false,"forceVirtualKeyboard":false,"preventMultipleLogon":false,"randomizeVirtualkeys":false,"timeout":{"forcedTimeout":0,"sessionIdleTimeout":10}}
             * authenticationConfiguration : {"passwordAuthentication":{"authenticationTimeout":1,"primaryAuthServers":{},"secondaryAuthServer":{}}}
             * clientConfiguration : {"autoReconnect":true,"upgradeNotification":false}
             * layoutConfigurationDto : {"bodyColor":"FFFFFF","companyName":"VMware","logoBackgroundColor":"56A2D4","logoExtention":"jpg","logoUri":"/api/4.0/edges/edge-4/sslvpn/config/layout/images/portallogo","menuBarColor":"999999","portalTitle":"VMware","rowAlternativeColor":"FFFFFF","rowColor":"F5F5F5","titleColor":"996600","topFrameColor":"000000"}
             * bgp : {"bgpNeighbours":{"bgpNeighbours":[{"bgpFilters":{"bgpFilters":[]},"holdDownTimer":3,"ipAddress":"172.21.254.25","keepAliveTimer":1,"remoteAS":65200,"weight":60},{"bgpFilters":{"bgpFilters":[{"action":"permit","direction":"out","network":"172.21.3.0/24"}]},"holdDownTimer":180,"ipAddress":"10.244.201.1","keepAliveTimer":60,"remoteAS":65301,"weight":60},{"bgpFilters":{"bgpFilters":[{"action":"permit","direction":"out","network":"172.21.3.0/24"}]},"holdDownTimer":180,"ipAddress":"10.244.202.1","keepAliveTimer":60,"remoteAS":65302,"weight":60}]},"defaultOriginate":false,"enabled":true,"gracefulRestart":true,"localAS":65200,"redistribution":{"enabled":true,"rules":{"rules":[{"action":"permit","from":{"bgp":false,"connected":true,"ospf":false,"static":false},"id":0}]}}}
             * ospf : {"defaultOriginate":false,"enabled":false,"gracefulRestart":true,"ospfAreas":{"ospfAreas":[{"areaId":51,"authentication":{"type":"none"},"type":"nssa"},{"areaId":0,"authentication":{"type":"none"},"type":"normal"}]},"ospfInterfaces":{"ospfInterfaces":[]},"redistribution":{"enabled":false,"rules":{"rules":[]}}}
             * routingGlobalConfig : {"ecmp":true,"logging":{"enable":false,"logLevel":"info"},"routerId":"10.244.201.11"}
             * staticRouting : {"staticRoutes":{"staticRoutes":[]}}
             * declareDeadTime : 6
             * security : {"enabled":false}
             * accelerationEnabled : false
             * applicationProfile : []
             * applicationRule : []
             * enableServiceInsertion : false
             * monitor : [{"interval":5,"maxRetries":3,"monitorId":"monitor-1","name":"default_tcp_monitor","timeout":15,"type":"tcp"},{"interval":5,"maxRetries":3,"method":"GET","monitorId":"monitor-2","name":"default_http_monitor","timeout":15,"type":"http","url":"/"},{"interval":5,"maxRetries":3,"method":"GET","monitorId":"monitor-3","name":"default_https_monitor","timeout":15,"type":"https","url":"/"}]
             * pool : []
             * virtualServer : []
             * global : {"caCertificates":{"caCertificate":[]},"crlCertificates":{"crlCertificate":[]},"psk":"******"}
             * sites : {"sites":[]}
             * ipPools : {"ipPools":[]}
             * staticBindings : {"staticBindings":[]}
             * bridges : []
             * rules : {"natRulesDtos":[]}
             */

            private boolean enabled;
            private String featureType;
            private LoggingBean logging;
            private int version;
            private DefaultPolicyBean defaultPolicy;
            private FirewallRulesBeanX firewallRules;
            private GlobalConfigBean globalConfig;
            private int cacheSize;
            private DnsViewsBean dnsViews;
            private ListenersBean listeners;
            private AdvancedConfigBean advancedConfig;
            private AuthenticationConfigurationBean authenticationConfiguration;
            private ClientConfigurationBean clientConfiguration;
            private LayoutConfigurationDtoBean layoutConfigurationDto;
            private BgpBean bgp;
            private OspfBean ospf;
            private RoutingGlobalConfigBean routingGlobalConfig;
            private StaticRoutingBean staticRouting;
            private int declareDeadTime;
            private SecurityBean security;
            private boolean accelerationEnabled;
            private boolean enableServiceInsertion;
            private GlobalBean global;
            private SitesBean sites;
            private IpPoolsBean ipPools;
            private StaticBindingsBean staticBindings;
            private RulesBeanXXX rules;
            private List<?> applicationProfile;
            private List<?> applicationRule;
            private List<MonitorBean> monitor;
            private List<?> pool;
            private List<?> virtualServer;
            private List<?> bridges;

            public boolean isEnabled() {
                return enabled;
            }

            public void setEnabled(boolean enabled) {
                this.enabled = enabled;
            }

            public String getFeatureType() {
                return featureType;
            }

            public void setFeatureType(String featureType) {
                this.featureType = featureType;
            }

            public LoggingBean getLogging() {
                return logging;
            }

            public void setLogging(LoggingBean logging) {
                this.logging = logging;
            }

            public int getVersion() {
                return version;
            }

            public void setVersion(int version) {
                this.version = version;
            }

            public DefaultPolicyBean getDefaultPolicy() {
                return defaultPolicy;
            }

            public void setDefaultPolicy(DefaultPolicyBean defaultPolicy) {
                this.defaultPolicy = defaultPolicy;
            }

            public FirewallRulesBeanX getFirewallRules() {
                return firewallRules;
            }

            public void setFirewallRules(FirewallRulesBeanX firewallRules) {
                this.firewallRules = firewallRules;
            }

            public GlobalConfigBean getGlobalConfig() {
                return globalConfig;
            }

            public void setGlobalConfig(GlobalConfigBean globalConfig) {
                this.globalConfig = globalConfig;
            }

            public int getCacheSize() {
                return cacheSize;
            }

            public void setCacheSize(int cacheSize) {
                this.cacheSize = cacheSize;
            }

            public DnsViewsBean getDnsViews() {
                return dnsViews;
            }

            public void setDnsViews(DnsViewsBean dnsViews) {
                this.dnsViews = dnsViews;
            }

            public ListenersBean getListeners() {
                return listeners;
            }

            public void setListeners(ListenersBean listeners) {
                this.listeners = listeners;
            }

            public AdvancedConfigBean getAdvancedConfig() {
                return advancedConfig;
            }

            public void setAdvancedConfig(AdvancedConfigBean advancedConfig) {
                this.advancedConfig = advancedConfig;
            }

            public AuthenticationConfigurationBean getAuthenticationConfiguration() {
                return authenticationConfiguration;
            }

            public void setAuthenticationConfiguration(AuthenticationConfigurationBean authenticationConfiguration) {
                this.authenticationConfiguration = authenticationConfiguration;
            }

            public ClientConfigurationBean getClientConfiguration() {
                return clientConfiguration;
            }

            public void setClientConfiguration(ClientConfigurationBean clientConfiguration) {
                this.clientConfiguration = clientConfiguration;
            }

            public LayoutConfigurationDtoBean getLayoutConfigurationDto() {
                return layoutConfigurationDto;
            }

            public void setLayoutConfigurationDto(LayoutConfigurationDtoBean layoutConfigurationDto) {
                this.layoutConfigurationDto = layoutConfigurationDto;
            }

            public BgpBean getBgp() {
                return bgp;
            }

            public void setBgp(BgpBean bgp) {
                this.bgp = bgp;
            }

            public OspfBean getOspf() {
                return ospf;
            }

            public void setOspf(OspfBean ospf) {
                this.ospf = ospf;
            }

            public RoutingGlobalConfigBean getRoutingGlobalConfig() {
                return routingGlobalConfig;
            }

            public void setRoutingGlobalConfig(RoutingGlobalConfigBean routingGlobalConfig) {
                this.routingGlobalConfig = routingGlobalConfig;
            }

            public StaticRoutingBean getStaticRouting() {
                return staticRouting;
            }

            public void setStaticRouting(StaticRoutingBean staticRouting) {
                this.staticRouting = staticRouting;
            }

            public int getDeclareDeadTime() {
                return declareDeadTime;
            }

            public void setDeclareDeadTime(int declareDeadTime) {
                this.declareDeadTime = declareDeadTime;
            }

            public SecurityBean getSecurity() {
                return security;
            }

            public void setSecurity(SecurityBean security) {
                this.security = security;
            }

            public boolean isAccelerationEnabled() {
                return accelerationEnabled;
            }

            public void setAccelerationEnabled(boolean accelerationEnabled) {
                this.accelerationEnabled = accelerationEnabled;
            }

            public boolean isEnableServiceInsertion() {
                return enableServiceInsertion;
            }

            public void setEnableServiceInsertion(boolean enableServiceInsertion) {
                this.enableServiceInsertion = enableServiceInsertion;
            }

            public GlobalBean getGlobal() {
                return global;
            }

            public void setGlobal(GlobalBean global) {
                this.global = global;
            }

            public SitesBean getSites() {
                return sites;
            }

            public void setSites(SitesBean sites) {
                this.sites = sites;
            }

            public IpPoolsBean getIpPools() {
                return ipPools;
            }

            public void setIpPools(IpPoolsBean ipPools) {
                this.ipPools = ipPools;
            }

            public StaticBindingsBean getStaticBindings() {
                return staticBindings;
            }

            public void setStaticBindings(StaticBindingsBean staticBindings) {
                this.staticBindings = staticBindings;
            }

            public RulesBeanXXX getRules() {
                return rules;
            }

            public void setRules(RulesBeanXXX rules) {
                this.rules = rules;
            }

            public List<?> getApplicationProfile() {
                return applicationProfile;
            }

            public void setApplicationProfile(List<?> applicationProfile) {
                this.applicationProfile = applicationProfile;
            }

            public List<?> getApplicationRule() {
                return applicationRule;
            }

            public void setApplicationRule(List<?> applicationRule) {
                this.applicationRule = applicationRule;
            }

            public List<MonitorBean> getMonitor() {
                return monitor;
            }

            public void setMonitor(List<MonitorBean> monitor) {
                this.monitor = monitor;
            }

            public List<?> getPool() {
                return pool;
            }

            public void setPool(List<?> pool) {
                this.pool = pool;
            }

            public List<?> getVirtualServer() {
                return virtualServer;
            }

            public void setVirtualServer(List<?> virtualServer) {
                this.virtualServer = virtualServer;
            }

            public List<?> getBridges() {
                return bridges;
            }

            public void setBridges(List<?> bridges) {
                this.bridges = bridges;
            }

            public static class LoggingBean implements Serializable {
                /**
                 * enable : true
                 * logLevel : notice
                 */

                private boolean enable;
                private String logLevel;

                public boolean isEnable() {
                    return enable;
                }

                public void setEnable(boolean enable) {
                    this.enable = enable;
                }

                public String getLogLevel() {
                    return logLevel;
                }

                public void setLogLevel(String logLevel) {
                    this.logLevel = logLevel;
                }
            }

            public static class DefaultPolicyBean  implements Serializable{
                /**
                 * action : deny
                 * loggingEnabled : false
                 */

                private String action;
                private boolean loggingEnabled;

                public String getAction() {
                    return action;
                }

                public void setAction(String action) {
                    this.action = action;
                }

                public boolean isLoggingEnabled() {
                    return loggingEnabled;
                }

                public void setLoggingEnabled(boolean loggingEnabled) {
                    this.loggingEnabled = loggingEnabled;
                }
            }

            public static class FirewallRulesBeanX  implements Serializable{
                private List<FirewallRulesBean> firewallRules;

                public List<FirewallRulesBean> getFirewallRules() {
                    return firewallRules;
                }

                public void setFirewallRules(List<FirewallRulesBean> firewallRules) {
                    this.firewallRules = firewallRules;
                }

                public static class FirewallRulesBean  implements Serializable{
                    /**
                     * action : accept
                     * application : {"applicationId":[],"service":[{"port":["179"],"protocol":"tcp","sourcePort":["any"]}]}
                     * description : routing
                     * enabled : true
                     * loggingEnabled : false
                     * name : routing
                     * ruleId : 131075
                     * ruleTag : 131075
                     * ruleType : internal_high
                     */

                    private String action;
                    private ApplicationBean application;
                    private String description;
                    private boolean enabled;
                    private boolean loggingEnabled;
                    private String name;
                    private int ruleId;
                    private int ruleTag;
                    private String ruleType;

                    public String getAction() {
                        return action;
                    }

                    public void setAction(String action) {
                        this.action = action;
                    }

                    public ApplicationBean getApplication() {
                        return application;
                    }

                    public void setApplication(ApplicationBean application) {
                        this.application = application;
                    }

                    public String getDescription() {
                        return description;
                    }

                    public void setDescription(String description) {
                        this.description = description;
                    }

                    public boolean isEnabled() {
                        return enabled;
                    }

                    public void setEnabled(boolean enabled) {
                        this.enabled = enabled;
                    }

                    public boolean isLoggingEnabled() {
                        return loggingEnabled;
                    }

                    public void setLoggingEnabled(boolean loggingEnabled) {
                        this.loggingEnabled = loggingEnabled;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public int getRuleId() {
                        return ruleId;
                    }

                    public void setRuleId(int ruleId) {
                        this.ruleId = ruleId;
                    }

                    public int getRuleTag() {
                        return ruleTag;
                    }

                    public void setRuleTag(int ruleTag) {
                        this.ruleTag = ruleTag;
                    }

                    public String getRuleType() {
                        return ruleType;
                    }

                    public void setRuleType(String ruleType) {
                        this.ruleType = ruleType;
                    }

                    public static class ApplicationBean  implements Serializable{
                        private List<?> applicationId;
                        private List<ServiceBean> service;

                        public List<?> getApplicationId() {
                            return applicationId;
                        }

                        public void setApplicationId(List<?> applicationId) {
                            this.applicationId = applicationId;
                        }

                        public List<ServiceBean> getService() {
                            return service;
                        }

                        public void setService(List<ServiceBean> service) {
                            this.service = service;
                        }

                        public static class ServiceBean  implements Serializable{
                            /**
                             * port : ["179"]
                             * protocol : tcp
                             * sourcePort : ["any"]
                             */

                            private String protocol;
                            private List<String> port;
                            private List<String> sourcePort;

                            public String getProtocol() {
                                return protocol;
                            }

                            public void setProtocol(String protocol) {
                                this.protocol = protocol;
                            }

                            public List<String> getPort() {
                                return port;
                            }

                            public void setPort(List<String> port) {
                                this.port = port;
                            }

                            public List<String> getSourcePort() {
                                return sourcePort;
                            }

                            public void setSourcePort(List<String> sourcePort) {
                                this.sourcePort = sourcePort;
                            }
                        }
                    }
                }
            }

            public static class GlobalConfigBean implements Serializable {
                /**
                 * dropInvalidTraffic : true
                 * enableSynFloodProtection : false
                 * icmp6Timeout : 10
                 * icmpTimeout : 10
                 * ipGenericTimeout : 120
                 * logInvalidTraffic : false
                 * tcpAllowOutOfWindowPackets : false
                 * tcpPickOngoingConnections : false
                 * tcpSendResetForClosedVsePorts : true
                 * tcpTimeoutClose : 30
                 * tcpTimeoutEstablished : 21600
                 * tcpTimeoutOpen : 30
                 * udpTimeout : 60
                 */

                private boolean dropInvalidTraffic;
                private boolean enableSynFloodProtection;
                private int icmp6Timeout;
                private int icmpTimeout;
                private int ipGenericTimeout;
                private boolean logInvalidTraffic;
                private boolean tcpAllowOutOfWindowPackets;
                private boolean tcpPickOngoingConnections;
                private boolean tcpSendResetForClosedVsePorts;
                private int tcpTimeoutClose;
                private int tcpTimeoutEstablished;
                private int tcpTimeoutOpen;
                private int udpTimeout;

                public boolean isDropInvalidTraffic() {
                    return dropInvalidTraffic;
                }

                public void setDropInvalidTraffic(boolean dropInvalidTraffic) {
                    this.dropInvalidTraffic = dropInvalidTraffic;
                }

                public boolean isEnableSynFloodProtection() {
                    return enableSynFloodProtection;
                }

                public void setEnableSynFloodProtection(boolean enableSynFloodProtection) {
                    this.enableSynFloodProtection = enableSynFloodProtection;
                }

                public int getIcmp6Timeout() {
                    return icmp6Timeout;
                }

                public void setIcmp6Timeout(int icmp6Timeout) {
                    this.icmp6Timeout = icmp6Timeout;
                }

                public int getIcmpTimeout() {
                    return icmpTimeout;
                }

                public void setIcmpTimeout(int icmpTimeout) {
                    this.icmpTimeout = icmpTimeout;
                }

                public int getIpGenericTimeout() {
                    return ipGenericTimeout;
                }

                public void setIpGenericTimeout(int ipGenericTimeout) {
                    this.ipGenericTimeout = ipGenericTimeout;
                }

                public boolean isLogInvalidTraffic() {
                    return logInvalidTraffic;
                }

                public void setLogInvalidTraffic(boolean logInvalidTraffic) {
                    this.logInvalidTraffic = logInvalidTraffic;
                }

                public boolean isTcpAllowOutOfWindowPackets() {
                    return tcpAllowOutOfWindowPackets;
                }

                public void setTcpAllowOutOfWindowPackets(boolean tcpAllowOutOfWindowPackets) {
                    this.tcpAllowOutOfWindowPackets = tcpAllowOutOfWindowPackets;
                }

                public boolean isTcpPickOngoingConnections() {
                    return tcpPickOngoingConnections;
                }

                public void setTcpPickOngoingConnections(boolean tcpPickOngoingConnections) {
                    this.tcpPickOngoingConnections = tcpPickOngoingConnections;
                }

                public boolean isTcpSendResetForClosedVsePorts() {
                    return tcpSendResetForClosedVsePorts;
                }

                public void setTcpSendResetForClosedVsePorts(boolean tcpSendResetForClosedVsePorts) {
                    this.tcpSendResetForClosedVsePorts = tcpSendResetForClosedVsePorts;
                }

                public int getTcpTimeoutClose() {
                    return tcpTimeoutClose;
                }

                public void setTcpTimeoutClose(int tcpTimeoutClose) {
                    this.tcpTimeoutClose = tcpTimeoutClose;
                }

                public int getTcpTimeoutEstablished() {
                    return tcpTimeoutEstablished;
                }

                public void setTcpTimeoutEstablished(int tcpTimeoutEstablished) {
                    this.tcpTimeoutEstablished = tcpTimeoutEstablished;
                }

                public int getTcpTimeoutOpen() {
                    return tcpTimeoutOpen;
                }

                public void setTcpTimeoutOpen(int tcpTimeoutOpen) {
                    this.tcpTimeoutOpen = tcpTimeoutOpen;
                }

                public int getUdpTimeout() {
                    return udpTimeout;
                }

                public void setUdpTimeout(int udpTimeout) {
                    this.udpTimeout = udpTimeout;
                }
            }

            public static class DnsViewsBean  implements Serializable{
                private List<DnsViewBean> dnsView;

                public List<DnsViewBean> getDnsView() {
                    return dnsView;
                }

                public void setDnsView(List<DnsViewBean> dnsView) {
                    this.dnsView = dnsView;
                }

                public static class DnsViewBean implements Serializable {
                    /**
                     * enabled : true
                     * name : vsm-default-view
                     * recursion : false
                     * viewId : view-0
                     * viewMatch : {"ipAddress":["any"],"ipSet":[],"vnic":["any"]}
                     */

                    private boolean enabled;
                    private String name;
                    private boolean recursion;
                    private String viewId;
                    private ViewMatchBean viewMatch;

                    public boolean isEnabled() {
                        return enabled;
                    }

                    public void setEnabled(boolean enabled) {
                        this.enabled = enabled;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public boolean isRecursion() {
                        return recursion;
                    }

                    public void setRecursion(boolean recursion) {
                        this.recursion = recursion;
                    }

                    public String getViewId() {
                        return viewId;
                    }

                    public void setViewId(String viewId) {
                        this.viewId = viewId;
                    }

                    public ViewMatchBean getViewMatch() {
                        return viewMatch;
                    }

                    public void setViewMatch(ViewMatchBean viewMatch) {
                        this.viewMatch = viewMatch;
                    }

                    public static class ViewMatchBean  implements Serializable{
                        private List<String> ipAddress;
                        private List<?> ipSet;
                        private List<String> vnic;

                        public List<String> getIpAddress() {
                            return ipAddress;
                        }

                        public void setIpAddress(List<String> ipAddress) {
                            this.ipAddress = ipAddress;
                        }

                        public List<?> getIpSet() {
                            return ipSet;
                        }

                        public void setIpSet(List<?> ipSet) {
                            this.ipSet = ipSet;
                        }

                        public List<String> getVnic() {
                            return vnic;
                        }

                        public void setVnic(List<String> vnic) {
                            this.vnic = vnic;
                        }
                    }
                }
            }

            public static class ListenersBean  implements Serializable{
                /**
                 * type : dhs_listener
                 * vnic : ["any"]
                 */

                private String type;
                private List<String> vnic;

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public List<String> getVnic() {
                    return vnic;
                }

                public void setVnic(List<String> vnic) {
                    this.vnic = vnic;
                }
            }

            public static class AdvancedConfigBean  implements Serializable {
                /**
                 * clientNotification :
                 * enableCompression : false
                 * enablePublicUrlAccess : false
                 * forceVirtualKeyboard : false
                 * preventMultipleLogon : false
                 * randomizeVirtualkeys : false
                 * timeout : {"forcedTimeout":0,"sessionIdleTimeout":10}
                 */

                private String clientNotification;
                private boolean enableCompression;
                private boolean enablePublicUrlAccess;
                private boolean forceVirtualKeyboard;
                private boolean preventMultipleLogon;
                private boolean randomizeVirtualkeys;
                private TimeoutBean timeout;

                public String getClientNotification() {
                    return clientNotification;
                }

                public void setClientNotification(String clientNotification) {
                    this.clientNotification = clientNotification;
                }

                public boolean isEnableCompression() {
                    return enableCompression;
                }

                public void setEnableCompression(boolean enableCompression) {
                    this.enableCompression = enableCompression;
                }

                public boolean isEnablePublicUrlAccess() {
                    return enablePublicUrlAccess;
                }

                public void setEnablePublicUrlAccess(boolean enablePublicUrlAccess) {
                    this.enablePublicUrlAccess = enablePublicUrlAccess;
                }

                public boolean isForceVirtualKeyboard() {
                    return forceVirtualKeyboard;
                }

                public void setForceVirtualKeyboard(boolean forceVirtualKeyboard) {
                    this.forceVirtualKeyboard = forceVirtualKeyboard;
                }

                public boolean isPreventMultipleLogon() {
                    return preventMultipleLogon;
                }

                public void setPreventMultipleLogon(boolean preventMultipleLogon) {
                    this.preventMultipleLogon = preventMultipleLogon;
                }

                public boolean isRandomizeVirtualkeys() {
                    return randomizeVirtualkeys;
                }

                public void setRandomizeVirtualkeys(boolean randomizeVirtualkeys) {
                    this.randomizeVirtualkeys = randomizeVirtualkeys;
                }

                public TimeoutBean getTimeout() {
                    return timeout;
                }

                public void setTimeout(TimeoutBean timeout) {
                    this.timeout = timeout;
                }

                public static class TimeoutBean  implements Serializable{
                    /**
                     * forcedTimeout : 0
                     * sessionIdleTimeout : 10
                     */

                    private int forcedTimeout;
                    private int sessionIdleTimeout;

                    public int getForcedTimeout() {
                        return forcedTimeout;
                    }

                    public void setForcedTimeout(int forcedTimeout) {
                        this.forcedTimeout = forcedTimeout;
                    }

                    public int getSessionIdleTimeout() {
                        return sessionIdleTimeout;
                    }

                    public void setSessionIdleTimeout(int sessionIdleTimeout) {
                        this.sessionIdleTimeout = sessionIdleTimeout;
                    }
                }
            }

            public static class AuthenticationConfigurationBean  implements Serializable{
                /**
                 * passwordAuthentication : {"authenticationTimeout":1,"primaryAuthServers":{},"secondaryAuthServer":{}}
                 */

                private PasswordAuthenticationBean passwordAuthentication;

                public PasswordAuthenticationBean getPasswordAuthentication() {
                    return passwordAuthentication;
                }

                public void setPasswordAuthentication(PasswordAuthenticationBean passwordAuthentication) {
                    this.passwordAuthentication = passwordAuthentication;
                }

                public static class PasswordAuthenticationBean implements Serializable {
                    /**
                     * authenticationTimeout : 1
                     * primaryAuthServers : {}
                     * secondaryAuthServer : {}
                     */

                    private int authenticationTimeout;
                    private PrimaryAuthServersBean primaryAuthServers;
                    private SecondaryAuthServerBean secondaryAuthServer;

                    public int getAuthenticationTimeout() {
                        return authenticationTimeout;
                    }

                    public void setAuthenticationTimeout(int authenticationTimeout) {
                        this.authenticationTimeout = authenticationTimeout;
                    }

                    public PrimaryAuthServersBean getPrimaryAuthServers() {
                        return primaryAuthServers;
                    }

                    public void setPrimaryAuthServers(PrimaryAuthServersBean primaryAuthServers) {
                        this.primaryAuthServers = primaryAuthServers;
                    }

                    public SecondaryAuthServerBean getSecondaryAuthServer() {
                        return secondaryAuthServer;
                    }

                    public void setSecondaryAuthServer(SecondaryAuthServerBean secondaryAuthServer) {
                        this.secondaryAuthServer = secondaryAuthServer;
                    }

                    public static class PrimaryAuthServersBean  implements Serializable{
                    }

                    public static class SecondaryAuthServerBean implements Serializable {
                    }
                }
            }

            public static class ClientConfigurationBean implements Serializable {
                /**
                 * autoReconnect : true
                 * upgradeNotification : false
                 */

                private boolean autoReconnect;
                private boolean upgradeNotification;

                public boolean isAutoReconnect() {
                    return autoReconnect;
                }

                public void setAutoReconnect(boolean autoReconnect) {
                    this.autoReconnect = autoReconnect;
                }

                public boolean isUpgradeNotification() {
                    return upgradeNotification;
                }

                public void setUpgradeNotification(boolean upgradeNotification) {
                    this.upgradeNotification = upgradeNotification;
                }
            }

            public static class LayoutConfigurationDtoBean  implements Serializable{
                /**
                 * bodyColor : FFFFFF
                 * companyName : VMware
                 * logoBackgroundColor : 56A2D4
                 * logoExtention : jpg
                 * logoUri : /api/4.0/edges/edge-4/sslvpn/config/layout/images/portallogo
                 * menuBarColor : 999999
                 * portalTitle : VMware
                 * rowAlternativeColor : FFFFFF
                 * rowColor : F5F5F5
                 * titleColor : 996600
                 * topFrameColor : 000000
                 */

                private String bodyColor;
                private String companyName;
                private String logoBackgroundColor;
                private String logoExtention;
                private String logoUri;
                private String menuBarColor;
                private String portalTitle;
                private String rowAlternativeColor;
                private String rowColor;
                private String titleColor;
                private String topFrameColor;

                public String getBodyColor() {
                    return bodyColor;
                }

                public void setBodyColor(String bodyColor) {
                    this.bodyColor = bodyColor;
                }

                public String getCompanyName() {
                    return companyName;
                }

                public void setCompanyName(String companyName) {
                    this.companyName = companyName;
                }

                public String getLogoBackgroundColor() {
                    return logoBackgroundColor;
                }

                public void setLogoBackgroundColor(String logoBackgroundColor) {
                    this.logoBackgroundColor = logoBackgroundColor;
                }

                public String getLogoExtention() {
                    return logoExtention;
                }

                public void setLogoExtention(String logoExtention) {
                    this.logoExtention = logoExtention;
                }

                public String getLogoUri() {
                    return logoUri;
                }

                public void setLogoUri(String logoUri) {
                    this.logoUri = logoUri;
                }

                public String getMenuBarColor() {
                    return menuBarColor;
                }

                public void setMenuBarColor(String menuBarColor) {
                    this.menuBarColor = menuBarColor;
                }

                public String getPortalTitle() {
                    return portalTitle;
                }

                public void setPortalTitle(String portalTitle) {
                    this.portalTitle = portalTitle;
                }

                public String getRowAlternativeColor() {
                    return rowAlternativeColor;
                }

                public void setRowAlternativeColor(String rowAlternativeColor) {
                    this.rowAlternativeColor = rowAlternativeColor;
                }

                public String getRowColor() {
                    return rowColor;
                }

                public void setRowColor(String rowColor) {
                    this.rowColor = rowColor;
                }

                public String getTitleColor() {
                    return titleColor;
                }

                public void setTitleColor(String titleColor) {
                    this.titleColor = titleColor;
                }

                public String getTopFrameColor() {
                    return topFrameColor;
                }

                public void setTopFrameColor(String topFrameColor) {
                    this.topFrameColor = topFrameColor;
                }
            }

            public static class BgpBean  implements Serializable{
                /**
                 * bgpNeighbours : {"bgpNeighbours":[{"bgpFilters":{"bgpFilters":[]},"holdDownTimer":3,"ipAddress":"172.21.254.25","keepAliveTimer":1,"remoteAS":65200,"weight":60},{"bgpFilters":{"bgpFilters":[{"action":"permit","direction":"out","network":"172.21.3.0/24"}]},"holdDownTimer":180,"ipAddress":"10.244.201.1","keepAliveTimer":60,"remoteAS":65301,"weight":60},{"bgpFilters":{"bgpFilters":[{"action":"permit","direction":"out","network":"172.21.3.0/24"}]},"holdDownTimer":180,"ipAddress":"10.244.202.1","keepAliveTimer":60,"remoteAS":65302,"weight":60}]}
                 * defaultOriginate : false
                 * enabled : true
                 * gracefulRestart : true
                 * localAS : 65200
                 * redistribution : {"enabled":true,"rules":{"rules":[{"action":"permit","from":{"bgp":false,"connected":true,"ospf":false,"static":false},"id":0}]}}
                 */

                private BgpNeighboursBeanX bgpNeighbours;
                private boolean defaultOriginate;
                private boolean enabled;
                private boolean gracefulRestart;
                private int localAS;
                private RedistributionBean redistribution;

                public BgpNeighboursBeanX getBgpNeighbours() {
                    return bgpNeighbours;
                }

                public void setBgpNeighbours(BgpNeighboursBeanX bgpNeighbours) {
                    this.bgpNeighbours = bgpNeighbours;
                }

                public boolean isDefaultOriginate() {
                    return defaultOriginate;
                }

                public void setDefaultOriginate(boolean defaultOriginate) {
                    this.defaultOriginate = defaultOriginate;
                }

                public boolean isEnabled() {
                    return enabled;
                }

                public void setEnabled(boolean enabled) {
                    this.enabled = enabled;
                }

                public boolean isGracefulRestart() {
                    return gracefulRestart;
                }

                public void setGracefulRestart(boolean gracefulRestart) {
                    this.gracefulRestart = gracefulRestart;
                }

                public int getLocalAS() {
                    return localAS;
                }

                public void setLocalAS(int localAS) {
                    this.localAS = localAS;
                }

                public RedistributionBean getRedistribution() {
                    return redistribution;
                }

                public void setRedistribution(RedistributionBean redistribution) {
                    this.redistribution = redistribution;
                }

                public static class BgpNeighboursBeanX  implements Serializable{
                    private List<BgpNeighboursBean> bgpNeighbours;

                    public List<BgpNeighboursBean> getBgpNeighbours() {
                        return bgpNeighbours;
                    }

                    public void setBgpNeighbours(List<BgpNeighboursBean> bgpNeighbours) {
                        this.bgpNeighbours = bgpNeighbours;
                    }

                    public static class BgpNeighboursBean implements Serializable {
                        /**
                         * bgpFilters : {"bgpFilters":[]}
                         * holdDownTimer : 3
                         * ipAddress : 172.21.254.25
                         * keepAliveTimer : 1
                         * remoteAS : 65200
                         * weight : 60
                         */

                        private BgpFiltersBean bgpFilters;
                        private int holdDownTimer;
                        private String ipAddress;
                        private int keepAliveTimer;
                        private int remoteAS;
                        private int weight;

                        public BgpFiltersBean getBgpFilters() {
                            return bgpFilters;
                        }

                        public void setBgpFilters(BgpFiltersBean bgpFilters) {
                            this.bgpFilters = bgpFilters;
                        }

                        public int getHoldDownTimer() {
                            return holdDownTimer;
                        }

                        public void setHoldDownTimer(int holdDownTimer) {
                            this.holdDownTimer = holdDownTimer;
                        }

                        public String getIpAddress() {
                            return ipAddress;
                        }

                        public void setIpAddress(String ipAddress) {
                            this.ipAddress = ipAddress;
                        }

                        public int getKeepAliveTimer() {
                            return keepAliveTimer;
                        }

                        public void setKeepAliveTimer(int keepAliveTimer) {
                            this.keepAliveTimer = keepAliveTimer;
                        }

                        public int getRemoteAS() {
                            return remoteAS;
                        }

                        public void setRemoteAS(int remoteAS) {
                            this.remoteAS = remoteAS;
                        }

                        public int getWeight() {
                            return weight;
                        }

                        public void setWeight(int weight) {
                            this.weight = weight;
                        }

                        public static class BgpFiltersBean  implements Serializable{
                            private List<?> bgpFilters;

                            public List<?> getBgpFilters() {
                                return bgpFilters;
                            }

                            public void setBgpFilters(List<?> bgpFilters) {
                                this.bgpFilters = bgpFilters;
                            }
                        }
                    }
                }

                public static class RedistributionBean  implements Serializable{
                    /**
                     * enabled : true
                     * rules : {"rules":[{"action":"permit","from":{"bgp":false,"connected":true,"ospf":false,"static":false},"id":0}]}
                     */

                    private boolean enabled;
                    private RulesBeanX rules;

                    public boolean isEnabled() {
                        return enabled;
                    }

                    public void setEnabled(boolean enabled) {
                        this.enabled = enabled;
                    }

                    public RulesBeanX getRules() {
                        return rules;
                    }

                    public void setRules(RulesBeanX rules) {
                        this.rules = rules;
                    }

                    public static class RulesBeanX implements Serializable {
                        private List<RulesBean> rules;

                        public List<RulesBean> getRules() {
                            return rules;
                        }

                        public void setRules(List<RulesBean> rules) {
                            this.rules = rules;
                        }

                        public static class RulesBean implements Serializable {
                            /**
                             * action : permit
                             * from : {"bgp":false,"connected":true,"ospf":false,"static":false}
                             * id : 0
                             */

                            private String action;
                            private FromBean from;
                            private int id;

                            public String getAction() {
                                return action;
                            }

                            public void setAction(String action) {
                                this.action = action;
                            }

                            public FromBean getFrom() {
                                return from;
                            }

                            public void setFrom(FromBean from) {
                                this.from = from;
                            }

                            public int getId() {
                                return id;
                            }

                            public void setId(int id) {
                                this.id = id;
                            }

                            public static class FromBean implements Serializable {
                                /**
                                 * bgp : false
                                 * connected : true
                                 * ospf : false
                                 * static : false
                                 */

                                private boolean bgp;
                                private boolean connected;
                                private boolean ospf;
                             //   @SerializedName("static")
                                private boolean staticX;

                                public boolean isBgp() {
                                    return bgp;
                                }

                                public void setBgp(boolean bgp) {
                                    this.bgp = bgp;
                                }

                                public boolean isConnected() {
                                    return connected;
                                }

                                public void setConnected(boolean connected) {
                                    this.connected = connected;
                                }

                                public boolean isOspf() {
                                    return ospf;
                                }

                                public void setOspf(boolean ospf) {
                                    this.ospf = ospf;
                                }

                                public boolean isStaticX() {
                                    return staticX;
                                }

                                public void setStaticX(boolean staticX) {
                                    this.staticX = staticX;
                                }
                            }
                        }
                    }
                }
            }

            public static class OspfBean  implements Serializable{
                /**
                 * defaultOriginate : false
                 * enabled : false
                 * gracefulRestart : true
                 * ospfAreas : {"ospfAreas":[{"areaId":51,"authentication":{"type":"none"},"type":"nssa"},{"areaId":0,"authentication":{"type":"none"},"type":"normal"}]}
                 * ospfInterfaces : {"ospfInterfaces":[]}
                 * redistribution : {"enabled":false,"rules":{"rules":[]}}
                 */

                private boolean defaultOriginate;
                private boolean enabled;
                private boolean gracefulRestart;
                private OspfAreasBeanX ospfAreas;
                private OspfInterfacesBean ospfInterfaces;
                private RedistributionBeanX redistribution;

                public boolean isDefaultOriginate() {
                    return defaultOriginate;
                }

                public void setDefaultOriginate(boolean defaultOriginate) {
                    this.defaultOriginate = defaultOriginate;
                }

                public boolean isEnabled() {
                    return enabled;
                }

                public void setEnabled(boolean enabled) {
                    this.enabled = enabled;
                }

                public boolean isGracefulRestart() {
                    return gracefulRestart;
                }

                public void setGracefulRestart(boolean gracefulRestart) {
                    this.gracefulRestart = gracefulRestart;
                }

                public OspfAreasBeanX getOspfAreas() {
                    return ospfAreas;
                }

                public void setOspfAreas(OspfAreasBeanX ospfAreas) {
                    this.ospfAreas = ospfAreas;
                }

                public OspfInterfacesBean getOspfInterfaces() {
                    return ospfInterfaces;
                }

                public void setOspfInterfaces(OspfInterfacesBean ospfInterfaces) {
                    this.ospfInterfaces = ospfInterfaces;
                }

                public RedistributionBeanX getRedistribution() {
                    return redistribution;
                }

                public void setRedistribution(RedistributionBeanX redistribution) {
                    this.redistribution = redistribution;
                }

                public static class OspfAreasBeanX  implements Serializable{
                    private List<OspfAreasBean> ospfAreas;

                    public List<OspfAreasBean> getOspfAreas() {
                        return ospfAreas;
                    }

                    public void setOspfAreas(List<OspfAreasBean> ospfAreas) {
                        this.ospfAreas = ospfAreas;
                    }

                    public static class OspfAreasBean  implements Serializable{
                        /**
                         * areaId : 51
                         * authentication : {"type":"none"}
                         * type : nssa
                         */

                        private int areaId;
                        private AuthenticationBean authentication;
                        private String type;

                        public int getAreaId() {
                            return areaId;
                        }

                        public void setAreaId(int areaId) {
                            this.areaId = areaId;
                        }

                        public AuthenticationBean getAuthentication() {
                            return authentication;
                        }

                        public void setAuthentication(AuthenticationBean authentication) {
                            this.authentication = authentication;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public static class AuthenticationBean implements Serializable {
                            /**
                             * type : none
                             */

                            private String type;

                            public String getType() {
                                return type;
                            }

                            public void setType(String type) {
                                this.type = type;
                            }
                        }
                    }
                }

                public static class OspfInterfacesBean implements Serializable {
                    private List<?> ospfInterfaces;

                    public List<?> getOspfInterfaces() {
                        return ospfInterfaces;
                    }

                    public void setOspfInterfaces(List<?> ospfInterfaces) {
                        this.ospfInterfaces = ospfInterfaces;
                    }
                }

                public static class RedistributionBeanX implements Serializable {
                    /**
                     * enabled : false
                     * rules : {"rules":[]}
                     */

                    private boolean enabled;
                    private RulesBeanXX rules;

                    public boolean isEnabled() {
                        return enabled;
                    }

                    public void setEnabled(boolean enabled) {
                        this.enabled = enabled;
                    }

                    public RulesBeanXX getRules() {
                        return rules;
                    }

                    public void setRules(RulesBeanXX rules) {
                        this.rules = rules;
                    }

                    public static class RulesBeanXX  implements Serializable{
                        private List<?> rules;

                        public List<?> getRules() {
                            return rules;
                        }

                        public void setRules(List<?> rules) {
                            this.rules = rules;
                        }
                    }
                }
            }

            public static class RoutingGlobalConfigBean implements Serializable {
                /**
                 * ecmp : true
                 * logging : {"enable":false,"logLevel":"info"}
                 * routerId : 10.244.201.11
                 */

                private boolean ecmp;
                private LoggingBeanX logging;
                private String routerId;

                public boolean isEcmp() {
                    return ecmp;
                }

                public void setEcmp(boolean ecmp) {
                    this.ecmp = ecmp;
                }

                public LoggingBeanX getLogging() {
                    return logging;
                }

                public void setLogging(LoggingBeanX logging) {
                    this.logging = logging;
                }

                public String getRouterId() {
                    return routerId;
                }

                public void setRouterId(String routerId) {
                    this.routerId = routerId;
                }

                public static class LoggingBeanX  implements Serializable{
                    /**
                     * enable : false
                     * logLevel : info
                     */

                    private boolean enable;
                    private String logLevel;

                    public boolean isEnable() {
                        return enable;
                    }

                    public void setEnable(boolean enable) {
                        this.enable = enable;
                    }

                    public String getLogLevel() {
                        return logLevel;
                    }

                    public void setLogLevel(String logLevel) {
                        this.logLevel = logLevel;
                    }
                }
            }

            public static class StaticRoutingBean implements Serializable {
                /**
                 * staticRoutes : {"staticRoutes":[]}
                 */

                private StaticRoutesBean staticRoutes;

                public StaticRoutesBean getStaticRoutes() {
                    return staticRoutes;
                }

                public void setStaticRoutes(StaticRoutesBean staticRoutes) {
                    this.staticRoutes = staticRoutes;
                }

                public static class StaticRoutesBean implements Serializable {
                    private List<?> staticRoutes;

                    public List<?> getStaticRoutes() {
                        return staticRoutes;
                    }

                    public void setStaticRoutes(List<?> staticRoutes) {
                        this.staticRoutes = staticRoutes;
                    }
                }
            }

            public static class SecurityBean implements Serializable {
                /**
                 * enabled : false
                 */

                private boolean enabled;

                public boolean isEnabled() {
                    return enabled;
                }

                public void setEnabled(boolean enabled) {
                    this.enabled = enabled;
                }
            }

            public static class GlobalBean  implements Serializable{
                /**
                 * caCertificates : {"caCertificate":[]}
                 * crlCertificates : {"crlCertificate":[]}
                 * psk : ******
                 */

                private CaCertificatesBean caCertificates;
                private CrlCertificatesBean crlCertificates;
                private String psk;

                public CaCertificatesBean getCaCertificates() {
                    return caCertificates;
                }

                public void setCaCertificates(CaCertificatesBean caCertificates) {
                    this.caCertificates = caCertificates;
                }

                public CrlCertificatesBean getCrlCertificates() {
                    return crlCertificates;
                }

                public void setCrlCertificates(CrlCertificatesBean crlCertificates) {
                    this.crlCertificates = crlCertificates;
                }

                public String getPsk() {
                    return psk;
                }

                public void setPsk(String psk) {
                    this.psk = psk;
                }

                public static class CaCertificatesBean  implements Serializable{
                    private List<?> caCertificate;

                    public List<?> getCaCertificate() {
                        return caCertificate;
                    }

                    public void setCaCertificate(List<?> caCertificate) {
                        this.caCertificate = caCertificate;
                    }
                }

                public static class CrlCertificatesBean implements Serializable {
                    private List<?> crlCertificate;

                    public List<?> getCrlCertificate() {
                        return crlCertificate;
                    }

                    public void setCrlCertificate(List<?> crlCertificate) {
                        this.crlCertificate = crlCertificate;
                    }
                }
            }

            public static class SitesBean implements Serializable {
                private List<?> sites;

                public List<?> getSites() {
                    return sites;
                }

                public void setSites(List<?> sites) {
                    this.sites = sites;
                }
            }

            public static class IpPoolsBean  implements Serializable{
                private List<?> ipPools;

                public List<?> getIpPools() {
                    return ipPools;
                }

                public void setIpPools(List<?> ipPools) {
                    this.ipPools = ipPools;
                }
            }

            public static class StaticBindingsBean  implements Serializable{
                private List<?> staticBindings;

                public List<?> getStaticBindings() {
                    return staticBindings;
                }

                public void setStaticBindings(List<?> staticBindings) {
                    this.staticBindings = staticBindings;
                }
            }

            public static class RulesBeanXXX implements Serializable {
                private List<?> natRulesDtos;

                public List<?> getNatRulesDtos() {
                    return natRulesDtos;
                }

                public void setNatRulesDtos(List<?> natRulesDtos) {
                    this.natRulesDtos = natRulesDtos;
                }
            }

            public static class MonitorBean implements Serializable {
                /**
                 * interval : 5
                 * maxRetries : 3
                 * monitorId : monitor-1
                 * name : default_tcp_monitor
                 * timeout : 15
                 * type : tcp
                 * method : GET
                 * url : /
                 */

                private int interval;
                private int maxRetries;
                private String monitorId;
                private String name;
                private int timeout;
                private String type;
                private String method;
                private String url;

                public int getInterval() {
                    return interval;
                }

                public void setInterval(int interval) {
                    this.interval = interval;
                }

                public int getMaxRetries() {
                    return maxRetries;
                }

                public void setMaxRetries(int maxRetries) {
                    this.maxRetries = maxRetries;
                }

                public String getMonitorId() {
                    return monitorId;
                }

                public void setMonitorId(String monitorId) {
                    this.monitorId = monitorId;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public int getTimeout() {
                    return timeout;
                }

                public void setTimeout(int timeout) {
                    this.timeout = timeout;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getMethod() {
                    return method;
                }

                public void setMethod(String method) {
                    this.method = method;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }
            }
        }
    }

    public static class QueryDaemonBean  implements Serializable{
        /**
         * enabled : false
         * port : 5666
         */

        private boolean enabled;
        private String port;

        public boolean isEnabled() {
            return enabled;
        }

        public void setEnabled(boolean enabled) {
            this.enabled = enabled;
        }

        public String getPort() {
            return port;
        }

        public void setPort(String port) {
            this.port = port;
        }
    }

    public static class VnicsBeanX  implements Serializable{
        private List<VnicsBean> vnics;

        public List<VnicsBean> getVnics() {
            return vnics;
        }

        public void setVnics(List<VnicsBean> vnics) {
            this.vnics = vnics;
        }

        public static class VnicsBean implements Serializable {
            /**
             * addressGroups : {"addressGroups":[{"primaryAddress":"172.21.254.18","subnetMask":"255.255.255.240","subnetPrefixLength":"28"}]}
             * enableProxyArp : false
             * enableSendRedirects : false
             * fenceParameters : []
             * index : 0
             * isConnected : true
             * label : vNic_0
             * mtu : 1500
             * name : Internal
             * portgroupId : virtualwire-2
             * portgroupName : Tenant_Transit_Logical_Local
             * type : internal
             */

            private AddressGroupsBeanX addressGroups;
            private boolean enableProxyArp;
            private boolean enableSendRedirects;
            private int index;
            private boolean isConnected;
            private String label;
            private int mtu;
            private String name;
            private String portgroupId;
            private String portgroupName;
            private String type;
            private List<?> fenceParameters;

            public AddressGroupsBeanX getAddressGroups() {
                return addressGroups;
            }

            public void setAddressGroups(AddressGroupsBeanX addressGroups) {
                this.addressGroups = addressGroups;
            }

            public boolean isEnableProxyArp() {
                return enableProxyArp;
            }

            public void setEnableProxyArp(boolean enableProxyArp) {
                this.enableProxyArp = enableProxyArp;
            }

            public boolean isEnableSendRedirects() {
                return enableSendRedirects;
            }

            public void setEnableSendRedirects(boolean enableSendRedirects) {
                this.enableSendRedirects = enableSendRedirects;
            }

            public int getIndex() {
                return index;
            }

            public void setIndex(int index) {
                this.index = index;
            }

            public boolean isIsConnected() {
                return isConnected;
            }

            public void setIsConnected(boolean isConnected) {
                this.isConnected = isConnected;
            }

            public String getLabel() {
                return label;
            }

            public void setLabel(String label) {
                this.label = label;
            }

            public int getMtu() {
                return mtu;
            }

            public void setMtu(int mtu) {
                this.mtu = mtu;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getPortgroupId() {
                return portgroupId;
            }

            public void setPortgroupId(String portgroupId) {
                this.portgroupId = portgroupId;
            }

            public String getPortgroupName() {
                return portgroupName;
            }

            public void setPortgroupName(String portgroupName) {
                this.portgroupName = portgroupName;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }

            public List<?> getFenceParameters() {
                return fenceParameters;
            }

            public void setFenceParameters(List<?> fenceParameters) {
                this.fenceParameters = fenceParameters;
            }

            public static class AddressGroupsBeanX  implements Serializable{
                private List<AddressGroupsBean> addressGroups;

                public List<AddressGroupsBean> getAddressGroups() {
                    return addressGroups;
                }

                public void setAddressGroups(List<AddressGroupsBean> addressGroups) {
                    this.addressGroups = addressGroups;
                }

                public static class AddressGroupsBean  implements Serializable{
                    /**
                     * primaryAddress : 172.21.254.18
                     * subnetMask : 255.255.255.240
                     * subnetPrefixLength : 28
                     */

                    private String primaryAddress;
                    private String subnetMask;
                    private String subnetPrefixLength;

                    public String getPrimaryAddress() {
                        return primaryAddress;
                    }

                    public void setPrimaryAddress(String primaryAddress) {
                        this.primaryAddress = primaryAddress;
                    }

                    public String getSubnetMask() {
                        return subnetMask;
                    }

                    public void setSubnetMask(String subnetMask) {
                        this.subnetMask = subnetMask;
                    }

                    public String getSubnetPrefixLength() {
                        return subnetPrefixLength;
                    }

                    public void setSubnetPrefixLength(String subnetPrefixLength) {
                        this.subnetPrefixLength = subnetPrefixLength;
                    }
                }
            }
        }
    }
}
