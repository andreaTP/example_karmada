package io.karmada.work.v1alpha2;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"nodeClaim","resourceRequest"})
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
public class ReplicaRequirementsSpec implements io.fabric8.kubernetes.api.model.KubernetesResource {

    @com.fasterxml.jackson.annotation.JsonProperty("nodeClaim")
    private NodeClaimSpec nodeClaim;

    public NodeClaimSpec getNodeClaim() {
        return nodeClaim;
    }

    public void setNodeClaim(NodeClaimSpec nodeClaim) {
        this.nodeClaim = nodeClaim;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("resourceRequest")
    private java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> resourceRequest;

    public java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> getResourceRequest() {
        return resourceRequest;
    }

    public void setResourceRequest(java.util.Map<java.lang.String, io.fabric8.kubernetes.api.model.IntOrString> resourceRequest) {
        this.resourceRequest = resourceRequest;
    }
}
