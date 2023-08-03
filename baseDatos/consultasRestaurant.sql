-- A continuación se plantearan las consultas solicitadas en la evaluación:

-- Consulta 1
-- Se solicita mostrar los nombres y cantidades solicitadas de los platos en el pedido de id 1.

SELECT P.Nombre AS Plato, DP.Cantidad
FROM Pedido
JOIN Detalle_Pedido DP ON Pedido.ID = DP.Pedido_ID
JOIN Plato P ON DP.Plato_ID = P.ID
WHERE Pedido.ID = 1;

-- Consulta 2
-- Se solicita una lista con la cantidad de pedidos que recibido cada mesa.

SELECT Numero AS Mesa, COUNT(PE.ID) AS Cantidad_Pedidos
FROM Mesa
LEFT JOIN Pedido PE ON Mesa.ID = PE.Mesa_ID
GROUP BY Mesa.ID, Mesa.Numero;

-- Consulta 3
-- Se solicita una lista con el monto de ventas de cada camarero, ordenados alfabéticamente
-- de forma descendente, agrupados por el nombre del camarero.

SELECT C.Nombre AS Camarero, SUM(DP.Subtotal) AS Monto_Ventas
FROM Camarero C
JOIN Pedido PE ON C.ID = PE.Camarero_ID
JOIN Detalle_Pedido DP ON PE.ID = DP.Pedido_ID
GROUP BY C.ID, C.Nombre
ORDER BY Monto_Ventas DESC;

-- Consulta 4
-- Se solicita mostrar el plato más solicitado y la cantidad correspondiente de solicitudes.

SELECT P.Nombre AS Plato, SUM(DP.Cantidad) AS Cantidad_Solicitudes
FROM Plato P
JOIN Detalle_Pedido DP ON P.ID = DP.Plato_ID
GROUP BY P.ID, P.Nombre
ORDER BY Cantidad_Solicitudes DESC
LIMIT 1;

-- Consulta 5
-- Se solicita una lista con los platos vendidos y el valor total que se ha obtenido por cada plato,
-- agrupados por el nombre del plato y ordenados de forma ascendente.

SELECT P.Nombre AS Plato, SUM(DP.Subtotal) AS Valor_Total
FROM Plato P
JOIN Detalle_Pedido DP ON P.ID = DP.Plato_ID
GROUP BY P.ID, P.Nombre
ORDER BY Valor_Total ASC;

-- /////////////////////////////////////////
-- Otras consultas (solo testing):
describe pedido;
describe mesa;
describe camarero;
describe detalle_pedido;
describe plato;
select * from mesa;
