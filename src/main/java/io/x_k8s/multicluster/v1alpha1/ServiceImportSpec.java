package io.x_k8s.multicluster.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"ips","ports","sessionAffinity","sessionAffinityConfig","type"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@lombok.ToString()
@lombok.EqualsAndHashCode()
@lombok.Setter()
@lombok.experimental.Accessors(prefix = {
    "_",
    ""
})
@io.sundr.builder.annotations.Buildable(editableEnabled = false, validationEnabled = false, generateBuilderPackage = false, builderPackage = "io.fabric8.kubernetes.api.builder", refs = {
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectMeta.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ObjectReference.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.LabelSelector.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Container.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.EnvVar.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.ContainerPort.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.Volume.class),
    @io.sundr.builder.annotations.BuildableReference(io.fabric8.kubernetes.api.model.VolumeMount.class)
})
public class ServiceImportSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("ips")
    private java.util.List<String> ips;

    public java.util.List<String> getIps() {
        return ips;
    }

    public void setIps(java.util.List<String> ips) {
        this.ips = ips;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("ports")
    @javax.validation.constraints.NotNull()
    private java.util.List<PortsSpec> ports;

    public java.util.List<PortsSpec> getPorts() {
        return ports;
    }

    public void setPorts(java.util.List<PortsSpec> ports) {
        this.ports = ports;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sessionAffinity")
    private String sessionAffinity;

    public String getSessionAffinity() {
        return sessionAffinity;
    }

    public void setSessionAffinity(String sessionAffinity) {
        this.sessionAffinity = sessionAffinity;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("sessionAffinityConfig")
    private SessionAffinityConfigSpec sessionAffinityConfig;

    public SessionAffinityConfigSpec getSessionAffinityConfig() {
        return sessionAffinityConfig;
    }

    public void setSessionAffinityConfig(SessionAffinityConfigSpec sessionAffinityConfig) {
        this.sessionAffinityConfig = sessionAffinityConfig;
    }

    public enum Type {

        ClusterSetIP, Headless
    }

    @com.fasterxml.jackson.annotation.JsonProperty("type")
    @javax.validation.constraints.NotNull()
    private Type type;

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
