<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Arithmetic Operations</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }
        .form-container {
            background: #fff;
            padding: 20px 30px;
            border-radius: 10px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
            width: 300px;
        }
        h2 {
            text-align: center;
            margin-bottom: 20px;
        }
        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px;
        }
        input, button {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 14px;
        }
        button {
            background-color: #4CAF50;
            color: white;
            border: none;
            cursor: pointer;
        }
        button:hover {
            background-color: #45a049;
        }
        .radio-group label {
            display: inline-block;
            margin-right: 10px;
        }
    </style>
</head>
<body>
<div class="form-container">
    <h2>Arithmetic Calculator</h2>
    <form action="Calculate" method="post">
        <label for="value1">First Number:</label>
        <input type="number" id="value1" name="value1" required>

        <label for="value2">Second Number:</label>
        <input type="number" id="value2" name="value2" required>

        <label>Operation:</label>
        <div class="radio-group">
            <input type="radio" id="add" name="operation" value="add" checked>
            <label for="add">Addition</label>
            <input type="radio" id="subtract" name="operation" value="subtract">
            <label for="subtract">Subtraction</label>
            <input type="radio" id="multiply" name="operation" value="multiply">
            <label for="multiply">Multiplication</label>
            <input type="radio" id="divide" name="operation" value="divide">
            <label for="divide">Division</label>
        </div>

        <button type="submit">Calculate</button>
    </form>
</div>
</body>
</html>
