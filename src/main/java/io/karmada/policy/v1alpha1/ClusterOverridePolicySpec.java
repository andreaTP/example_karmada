package io.karmada.policy.v1alpha1;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"overrideRules","overriders","resourceSelectors","targetCluster"})
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
public class ClusterOverridePolicySpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("overrideRules")
    private java.util.List<OverrideRulesSpec> overrideRules;

    public java.util.List<OverrideRulesSpec> getOverrideRules() {
        return overrideRules;
    }

    public void setOverrideRules(java.util.List<OverrideRulesSpec> overrideRules) {
        this.overrideRules = overrideRules;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("overriders")
    private OverridersSpec overriders;

    public OverridersSpec getOverriders() {
        return overriders;
    }

    public void setOverriders(OverridersSpec overriders) {
        this.overriders = overriders;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceSelectors")
    private java.util.List<ResourceSelectorsSpec> resourceSelectors;

    public java.util.List<ResourceSelectorsSpec> getResourceSelectors() {
        return resourceSelectors;
    }

    public void setResourceSelectors(java.util.List<ResourceSelectorsSpec> resourceSelectors) {
        this.resourceSelectors = resourceSelectors;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("targetCluster")
    private TargetClusterSpec targetCluster;

    public TargetClusterSpec getTargetCluster() {
        return targetCluster;
    }

    public void setTargetCluster(TargetClusterSpec targetCluster) {
        this.targetCluster = targetCluster;
    }
}
