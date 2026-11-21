async function procesarPedido(pedidoId) {
  const respuesta = fetch(`https://api.tienda.local/pedidos/${pedidoId}`);
  const datos = respuesta.json();
  if (datos.estado === "PAGADO") {
    return { ok: true, total: datos.monto };
  }
  return { ok: false, total: 0 };
}
